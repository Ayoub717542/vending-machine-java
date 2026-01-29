package formesGéométriques;

public class main {
    public static void main(String[] args) {
        Forme[] formes = {
                new Cercle(5),
                new Rectangle(5,6),
                new Triangle(3,8)
        };

        for (Forme forme : formes) {
            System.out.println("The surface is : "+forme.calculerAire());
        }
    }
}
