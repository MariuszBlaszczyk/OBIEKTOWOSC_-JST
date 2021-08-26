package classobjects.zad1.main;


import classobjects.zad1.model.Company;
import classobjects.zad1.model.Employee;
import classobjects.zad1.model.Seniority;

public class App {

    public static void main(String[] args) {

        Company company = new Company();

        Employee employee1 = new Employee("Adam", "Mickiewicz", 1980, Seniority.SENIOR.getSalaryLevel());
        company.addEmployee(employee1);
        Employee employee2 = new Employee("Bolesław", "Prus", 1985, Seniority.MID.getSalaryLevel());
        company.addEmployee(employee2);
        Employee employee3 = new Employee("Jakub", "Żulczyk", 1990, Seniority.JUNIOR.getSalaryLevel());
        company.addEmployee(employee3);

        company.showEmployeesList();

    }
}

