//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("****Distributeur-Automatique****");
        String[] produits = {"Eau", "Soda", "Chips", "Chocolat"};
        int[] prix = {5, 8, 12, 15};
        int[] stock = {10, 5, 7, 3};
        for (int i = 0; i < produits.length; i++) {
            System.out.println("Produit: " + produits[i] +
                    ", Prix: " + prix[i] + " MAD " +
                    ", Stock: " + stock[i]);
        }

            System.out.println();

        }
    }


