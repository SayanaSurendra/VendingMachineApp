package se.lexicon;

import se.lexicon.impl.VendingMachineImpl;
import se.lexicon.model.Product;


public class Main {
    public static void main(String[] args) {

        Chocolate chocolate=new Chocolate(10,"Marabou","MilkChcoolate");
        //System.out.println(chocolate.toString());
        chocolate.examine();
        chocolate.use();

        Product[] availableProducts={ new Chips(20,"Estrella","SourCream and Onion"),
                                      new Drinks(30,"Tropicana","Apple"),
                                     // new Chocolate(25,"Marabou","Milk Chocolate")
                                    chocolate
                                    };

        VendingMachine item= new VendingMachineImpl(availableProducts);
        item.addCurrency(50);
        System.out.println(item.request(chocolate.getId()));

        System.out.println(item.getDescription(chocolate.getId()));
        String[] products= item.getProducts();
        for(String productDetails:products){
            System.out.println(productDetails);
        }



    }
}