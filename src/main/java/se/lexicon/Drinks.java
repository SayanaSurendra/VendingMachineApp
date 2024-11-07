package se.lexicon;

import se.lexicon.model.Product;

public class Drinks extends Product {

    String flavor;

    public Drinks(double price, String productName,String flavor) {
        super(price, productName);
        this.flavor=flavor;
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
