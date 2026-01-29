package employes_salaires;
public class EmployeHoraire extends Employe {
    double heuresTravaillees;
    double tauxHoraire;

    public EmployeHoraire(String name, int salary_base, double heures, double taux) {
            super(name, salary_base);
            this.name=name;
            this.salary_base=  salary_base;
            this.heuresTravaillees = heures;
            this.tauxHoraire = taux;
    }
    public  double calculerSalaire() {
        return salary_base + (heuresTravaillees * tauxHoraire);
    }

}