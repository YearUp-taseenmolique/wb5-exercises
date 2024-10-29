package com.pluralsight;

public class Stock extends Asset {

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    private String ticker;

}