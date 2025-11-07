public class VendingMachine {
    public static void main(String[] args) {

        public void recharger(ArrayList<Integer> stock ) {
            System.out.println("======== Recharger le stock ========");
            System.out.println("1. Soda");
            System.out.println("2. chips");
            System.out.println("3. Eau");
            System.out.println("4. Chocolate");
            System.out.println("5. Quitter");
            System.out.println("====================================");

            Scanner c = new Scanner(System.in);
            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Combien ?: ");
                    int q = scanner.nextInt();
                    stock.set(1, q);
                    break;
                case 2:
                    System.out.println("Combien ?: ");
                    int q = scanner.nextInt();
                    stock.set(2, q);
                    break;
                case 3:
                    System.out.println("Combien ?: ");
                    int q = scanner.nextInt();
                    stock.set(0, q);
                    break;
                case 4:
                    System.out.println("Combien ?: ");
                    int q = scanner.nextInt();
                    stock.set(3, q);
                    break;
                case 5:
                    break;
            }
        }

        public void sauvegarder(ArrayList<Integer> stock) {
            FileWriter writer = new FileWriter("Stock.txt");
            writer.write("Eau : " + stock.get(0) + " Soda : " + stock.get(1) + " Chips : " + stock.get(2) + " Chocolat : " + stock.get(3));
            writer.close();
        }


        public int compteurDacha(){
            int compteur;
            compteur++;
            return compteur;

        }
    }
}