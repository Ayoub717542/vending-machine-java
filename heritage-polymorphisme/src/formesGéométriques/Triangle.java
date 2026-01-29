package formesGéométriques;

import java.awt.*;

public class Triangle extends Forme {
    double base;
    double hauteur;

    public Triangle(double largeur, double hauteur){
        this.base = largeur;
        this.hauteur = hauteur;
    }

    public double calculerAire(){
        return 0.5 * base * hauteur;

    }
}
