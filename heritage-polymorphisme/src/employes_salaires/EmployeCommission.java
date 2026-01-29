package employes_salaires;

public class EmployeCommission extends Employe {
    double ventes;
    double commission;
    public EmployeCommission(String name, int salary_base, double ventes, double commission) {
        super(name,salary_base);
        this.name=name;
        this.salary_base=  salary_base;
        this.ventes=ventes;
        this.commission=commission;
    }
public  double calculerSalaire() {
    return salary_base+(ventes*commission);
}
}
