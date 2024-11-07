package se.lexicon.model;

import se.lexicon.util.IDGenerator;

public abstract class Product {

     private int id;
     private double price;
     private String productName;

    public Product(double price, String productName) {
        this.id= IDGenerator.generateId();
        this.price = price;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public abstract String examine();
    public abstract String use();


}
