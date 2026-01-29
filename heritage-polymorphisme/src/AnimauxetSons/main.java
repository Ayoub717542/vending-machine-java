package AnimauxetSons;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Animal>animals=new ArrayList<Animal>();
        Chat chat = new Chat("Micho",2);
        Chien chien = new Chien("chien",1);
        Vach vach = new Vach("Vach",5);
        animals.add(chat);
        animals.add(chien);
        animals.add(vach);

        for(Animal animal: animals){
            System.out.println(
                    "\nNom:"+animal.getNom()
                    +"\nage:"+animal.getAge()
                    +"\nmake a sound like: "+animal.faireSon()+"\nmanger :"+animal.manger()
            );

        }
    }
}