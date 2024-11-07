package se.lexicon.impl;

import se.lexicon.VendingMachine;
import se.lexicon.model.CurrencyDenomination;
import se.lexicon.model.Product;

import java.util.Arrays;

public class VendingMachineImpl implements VendingMachine {
  private  Product[] products;
   private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }


    @Override
    public void addCurrency(int amount) {
        for(CurrencyDenomination denomination: CurrencyDenomination.values()) {
            if (denomination.getValue()== amount) {
                depositPool += amount;
                System.out.println("Added amount:" + amount);
                System.out.println("depositPool:" + depositPool);
            }
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
       for(Product product: products){
            if(product.getId() == id){
               if(depositPool>= product.getPrice()){
                   depositPool-= product.getPrice();
                   System.out.println(product.examine());
                   return product;
               }else{
                   System.out.println("Insufficient balance, you need to add more amount");
                   return null;
               }
            }
        }

       System.out.println("Product Id : "+ id+" not found");
       return null;

    }

    @Override
    public int endSession() {
       this.depositPool=0;
        return depositPool;
    }

    @Override
    public String getDescription(int id) {
         for(Product product: products){
            if(product.getId() == id) {
                 return product.examine();
            }
            }
        System.out.println("Product Id : "+ id +" not found");
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[]{Arrays.toString(products)};
    }
}
