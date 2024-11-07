package se.lexicon;

import se.lexicon.model.Product;

public class Chocolate extends Product {

    String type;


    public Chocolate(double price, String productName, String type) {
        super(price, productName);
        this.type = type;
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
