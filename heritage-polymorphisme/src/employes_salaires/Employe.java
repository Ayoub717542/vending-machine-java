package employes_salaires;

public class Employe {
    public  String name;
    public   int salary_base;
    public Employe(String name, int salary_base) {
        this.name = name;
        this.salary_base = salary_base;
    }
    public double calculerSalaire(){
            return salary_base;
    }

}
