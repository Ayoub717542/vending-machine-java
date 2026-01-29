public class Compte {
    private int numero;
    private double solde;

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void verser(){
        System.out.println("Numero compte: " + this.numero);
        System.out.println("Solde: " + this.solde);
    }
    public void retirer(){
        System.out.println("Numero compte: " + this.numero);
        System.out.println("Solde: " + this.solde);
    }


}
