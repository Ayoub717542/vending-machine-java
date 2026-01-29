public class CompteEpargne extends Compte {
    private double tauxInteret;
    public CompteEpargne(int numero, double solde, double tauxInteret) {
        super(numero, solde);
        this.tauxInteret = tauxInteret;
    }
public void verser(){
        getSolde()+=getSolde()*tauxInteret;
    System.out.println("Solde: " + getSolde());

}
}
