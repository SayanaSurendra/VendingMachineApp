package se.lexicon;

import se.lexicon.model.Product;
import se.lexicon.util.IDGenerator;

public class Chocolate implements Product {

    private int id;
    private  double price;
    private String productName;
    private String type;


    public Chocolate(double price, String productName, String type) {
        this.id= IDGenerator.generateId();
        this.price = price;
        this.productName = productName;
        this.type = type;
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
        return "Chcocolate is so yummy";
    }


    @Override
    public String toString() {
        return "Chocolate{" +
                "Id:'" + getId() + '\'' +
                "ProductName.'" + getProductName() + '\'' +
                " Price:'" + getPrice() + '\'' +
                " type:'" + type + '\'' +
                '}';
    }
}
