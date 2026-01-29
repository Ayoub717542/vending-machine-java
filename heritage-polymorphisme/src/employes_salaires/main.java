package employes_salaires;

import java.util.ArrayList;
import java.util.List;

public class main {
    List<Employe> employees = new ArrayList<>();
    public void addEmployee(Employe employee) {
        employees.add(employee);
    }
    public static void main(String[] args) {
        main app = new main();
        EmployeHoraire employeHoraire= new EmployeHoraire("Aymen",2050,12,100);
        EmployeCommission employeCommission= new EmployeCommission("Ayoub",1100,10,5);
        Employe emp1=new Employe("sami",1200);
        app.addEmployee(emp1);
        app.addEmployee(employeHoraire);
        app.addEmployee(employeCommission);
        for(Employe emp: app.employees){
            System.out.println(emp.name+"\n Salaire :"+emp.calculerSalaire());
        }


    }
}
