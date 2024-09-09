package com.csc340.demo;

public class Cryptocurrency {
    private String name;
    private String symbol;
    private double currentPrice;
    private int marketCapRank; // Added field

    public Cryptocurrency(String name, String symbol, double currentPrice, int marketCapRank) {
        this.name = name;
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        this.marketCapRank = marketCapRank;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getMarketCapRank() {
        return marketCapRank;
    }

    public void setMarketCapRank(int marketCapRank) {
        this.marketCapRank = marketCapRank;
    }

}
