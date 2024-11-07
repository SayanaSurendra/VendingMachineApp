package se.lexicon.model;

public interface Product {
    public String examine();
    public String use();
    public int getId();
    public String getProductName();
    public void setProductName(String productName);
    public  double getPrice();
    public void setPrice(double price);

}
