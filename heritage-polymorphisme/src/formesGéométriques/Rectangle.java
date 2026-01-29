package formesGéométriques;

public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur){
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    public double getLargeur() {
        return largeur;
    }
    public double getHauteur() {
        return hauteur;
    }
    public double calculerArea(){
        return largeur*hauteur;
    }
}
