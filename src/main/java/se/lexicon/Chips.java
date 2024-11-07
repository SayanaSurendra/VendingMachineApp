package se.lexicon;

import se.lexicon.model.Product;
import se.lexicon.util.IDGenerator;

public class Chips implements Product {

    private int id;
    private  double price;
    private String productName;
    private String ingredients;


    public Chips(double price, String productName, String ingredients) {
        this.id=IDGenerator.generateId();
        this.price = price;
        this.productName = productName;
        this.ingredients = ingredients;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
       this.productName=productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
      this.price=price;
    }

    @Override
    public String examine() {
        return "Product Details: " + this.toString();
    }

    @Override
    public String use() {
        return "Its crispy";
    }

    @Override
    public String toString() {
        return "Chips{" +
                "Id:'" + getId() + '\''+
                "ProductName:'" + getProductName() + '\''+
                " ingredients:'" + ingredients + '\'' +
                " ProductName:'" + getPrice() + '\''+
                '}';
    }
}
