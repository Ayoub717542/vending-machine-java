import java.util.*;
import java.io.*;

public class VendingMachine {

public static void main(String[] args) {
ArrayList<String> produits = new ArrayList<>(Arrays.asList("Eau","Soda","Chips","Chocolat"));
ArrayList<Integer> prix = new ArrayList<>(Arrays.asList(5, 8, 12, 15)); // use ints to keep it simple
ArrayList<Integer> stock = new ArrayList<>(Arrays.asList(10, 5, 7, 3));
Scanner scanner = new Scanner(System.in);
while(true) {
    acheterProduit(produits, prix, stock, scanner);
    System.out.println("Updated stock: " + stock);
}
    }
    public static void acheterProduit(ArrayList<String> produits,ArrayList<Integer> prix,ArrayList<Integer> stock,Scanner scanner) 
    {
        System.out.println("saiser le number de produit : ");
        int n = scanner.nextInt();
        int index=n-1;
       

    String produit_Nom =  produits.get(index);
    int produit_prix  =  prix.get(index);
    int produit_Stock =  stock.get(index);


if ( produit_Stock > 0 ) {
        System.out.println("saiser prix : ");
        int user_prix = scanner.nextInt();
    if (user_prix == produit_prix ) {
        stock.set(index, produit_Stock - 1);
        System.out.println("you have bought : "+produit_Nom);
    }else if (user_prix < produit_prix){
        System.out.println("the produit cost more money that this : "+ user_prix);
    }
    else if (user_prix > produit_prix){
        int return_change=user_prix-prix.get(index);
        System.out.println("You have bought: " + produit_Nom);
        stock.set(index, produit_Stock - 1);
        System.out.println("Change returned: " + return_change + " MAD");
    }  
    }
    else{
    System.out.println("Product out of stock.");
}
        

}

}
