package se.lexicon;

import se.lexicon.model.Product;
import se.lexicon.util.IDGenerator;

public class Drinks implements Product {

    private int id;
    private  double price;
    private String productName;
    private String flavor;

    public Drinks(double price, String productName, String flavor) {
        this.id= IDGenerator.generateId();
        this.price = price;
        this.productName = productName;
        this.flavor = flavor;
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
        return "Its a refreshing drink";
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "Id:'" + getId() + '\'' +
                "ProductName.'" + getProductName() + '\'' +
                " Price:'" + getPrice() + '\'' +
                "flavor='" + flavor + '\'' +
                '}';
    }
}
