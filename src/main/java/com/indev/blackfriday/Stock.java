package com.indev.blackfriday;

public class Stock {
    private Product product;
    private int quantite;

    public Stock(Product product, int quantite) {
        this.product = product;
        this.quantite = quantite;
    }

    public Stock() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

}
