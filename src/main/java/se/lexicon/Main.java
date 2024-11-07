package se.lexicon;

import se.lexicon.impl.VendingMachineImpl;
import se.lexicon.model.Product;


public class Main {
    public static void main(String[] args) {

        Chocolate chocolate=new Chocolate(10,"Marabou","MilkChcoolate");
        Chips estrellaChips=new Chips(20,"Estrella","SourCream and Onion");
        Drinks tropicanaApple=new Drinks(30,"Tropicana","Apple");
        System.out.println(chocolate.examine());
        System.out.println(chocolate.use());


        Product[] availableProducts={chocolate,estrellaChips,tropicanaApple};

        VendingMachine item= new VendingMachineImpl(availableProducts);
        item.addCurrency(10);

        item.request(estrellaChips.getId());
        item.request(102);
        System.out.println(item.getDescription(chocolate.getId()));
        //System.out.println(chocolate.getId());
        item.request(chocolate.getId());
        item.getDescription(estrellaChips.getId());
       // item.getDescription(12);

        String[] products= item.getProducts();
        for(String productDetails:products){
            System.out.println(productDetails);
        }

        item.endSession();
        System.out.println(item.getBalance());



    }
}