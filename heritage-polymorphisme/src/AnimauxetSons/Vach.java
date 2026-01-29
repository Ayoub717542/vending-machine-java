package AnimauxetSons;

public class Vach extends Animal {
    private  String nom;
    private  int age;

    public Vach(String nom, int age) {
        super(nom, age);
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String faireSon(){
        String S;
        S = "MOO";
        return S;
    }
    public String manger(){
        String S;
        S = "manger tban";
        return S;
    }
}
