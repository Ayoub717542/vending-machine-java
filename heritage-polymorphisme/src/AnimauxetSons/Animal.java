package AnimauxetSons;

public class Animal {
    private  String nom;
    private int age;
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public String faireSon(){
        System.out.println("faire son");
       return "";
   }
   public String manger(){
        System.out.println("manger son");
        return "";
   }

}
