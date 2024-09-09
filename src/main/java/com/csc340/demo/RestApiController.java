package com.csc340.demo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class RestApiController {


    /**
     * Get a list of cryptocurrencies from CoinGecko and make them available at our own API endpoint.
     *
     * @return a list of Cryptocurrencies.
     */
    @GetMapping("/cryptos")
    public Object getCryptocurrencies() {
        try {
            String url = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jsonListResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonListResponse);

            List<Cryptocurrency> cryptoList = new ArrayList<>();

            //The response from the above API is a JSON Array, which we loop through.
            for (JsonNode node : root) {
                //Extract relevant info from the response and use it to build a Cryptocurrency object
                String name = node.get("name").asText();
                String symbol = node.get("symbol").asText();
                double currentPrice = node.get("current_price").asDouble();
                int marketCapRank = node.get("market_cap_rank").asInt();

                Cryptocurrency crypto = new Cryptocurrency(name, symbol, currentPrice, marketCapRank);
                cryptoList.add(crypto);
            }
            return cryptoList;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(RestApiController.class.getName()).log(Level.SEVERE,
                    null, ex);
            return "error in /cryptos";
        }
    }
}
