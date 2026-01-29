package formesGéométriques;

public class Cercle extends Forme{
    public double rayon;

    public Cercle(double rayon){
        this.rayon = rayon;

    }

    public double calculerAire(){
        return Math.PI*rayon*rayon;
    }
}
