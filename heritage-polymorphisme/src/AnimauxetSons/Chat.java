package AnimauxetSons;

public class Chat extends Animal {
    private  String nom;
    private int age;
    public Chat(String nom, int age) {
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
      S = "meow meow meow";
        return S;
    }
    public String manger(){
        String S;
        S = "manger sorit";
        return S;
    }
}
