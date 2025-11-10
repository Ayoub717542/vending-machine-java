
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class purchaslogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> produits = new ArrayList<>(List.of("Eau", "Soda", "Chips", "Chocolat"));
        ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0));
        ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));

        System.out.print("Entrez le numéro du produit à acheter : ");
        int numProduit = scanner.nextInt() - 1;

        if (numProduit >= 0 && numProduit < produits.size()) {

            if (stock.get(numProduit) > 0) {


                System.out.print("Entrez le montant inséré : ");
                double montant = scanner.nextDouble();


                if (montant >= prix.get(numProduit)) {


                    System.out.println("Vous avez acheté : " + produits.get(numProduit));


                    double monnaie = montant - prix.get(numProduit);
                    System.out.println("Monnaie rendue : " + monnaie + " MAD");

                    stock.set(numProduit, stock.get(numProduit) - 1);
                } else {
                    System.out.println("Montant insuffisant !");
                }
            } else {

                System.out.println("Produit en rupture de stock !");
            }
        } else {

            System.out.println("Numéro de produit invalide !");
        }

        scanner.close();
    }
}
