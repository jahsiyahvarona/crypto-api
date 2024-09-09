# Cryptocurrency API

This project provides a RESTful API to retrieve cryptocurrency data using the CoinGecko API. The API allows you to fetch information about cryptocurrencies including their names, symbols, current prices, and market cap ranks.

## Project Overview

The API is built with Java and Spring Boot. It includes endpoints for fetching cryptocurrency data and handling exceptions.

## Endpoints

### GET /cryptos

Fetches a list of cryptocurrencies with the following details:
- **name**: The name of the cryptocurrency.
- **symbol**: The symbol of the cryptocurrency.
- **current_price**: The current price of the cryptocurrency in USD.
- **market_cap_rank**: The market cap rank of the cryptocurrency.

#### instruction
Clone the project (or download zip) and open it in IntelliJ.
MAC OS users may need to change the permissions (chmod -R 777 path/to/project/folder in your terminal) for the project folder when they clone or download this repo.
Make sure jdk versions match.
Run the main method.

On POSTMAN:
```http
GET http://localhost:8080/cryptos
