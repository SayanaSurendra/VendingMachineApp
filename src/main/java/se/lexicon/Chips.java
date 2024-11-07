package se.lexicon;

import se.lexicon.model.Product;

public class Chips extends Product {

    String ingredients;

    public Chips(double price, String productName, String ingredients) {
        super(price, productName);
        this.ingredients = ingredients;
    }


    @Override
    public String examine() {
        return getProductName() + " " + getPrice();
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
