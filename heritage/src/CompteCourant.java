public class CompteCourant extends Compte{
private int limite;
    public CompteCourant(int numero, double solde, int limite) {
        super(numero, solde);
        this.limite = limite;

    }
    public void retirer(double montant){
       if(getSolde() - montant >= limite){
           getSolde() -= montant;
           System.out.println("Retrait effectué : " + montant);
       } else {
           System.out.println("Retrait refusé, dépasse la limite !");
       }

       }

    }

}
