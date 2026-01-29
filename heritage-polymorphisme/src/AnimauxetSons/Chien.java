package AnimauxetSons;

public class Chien extends Animal {
    private  String nom;
    private int age;
    public Chien(String nom, int age) {
        super(nom, age);
        this.nom = nom;
        this.age = age;
    }
    public String faireSon(){
        String S;
        S = "whouf whouf";
        return S;
    }
    public String manger(){
        String S;
        S = "manger meet";
        return S;
    }
}
