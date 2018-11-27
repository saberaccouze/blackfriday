package com.indev.blackfriday;

import java.util.ArrayList;

public class Company {
    public  ArrayList<Stock> STOCK_TOTAL = new ArrayList<Stock>();

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int quantite, String capsule, int price) {
        Stock stock =new Stock();
        stock.setProduct(new Product(capsule,price));
        stock.setQuantite(quantite);
        STOCK_TOTAL.add(stock);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int totalPrice=0;
        for (int i=0;i<STOCK_TOTAL.size();i++){
            totalPrice +=STOCK_TOTAL.get(i).getProduct().getPrice()*STOCK_TOTAL.get(i).getQuantite();
        }
        return totalPrice;
    }

    public Company blackFriday() {
        return this;
    }
}
