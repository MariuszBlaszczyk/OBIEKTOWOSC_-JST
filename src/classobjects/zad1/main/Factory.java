package classobjects.zad1.main;

import classobjects.zad1.logic.Employee;
import classobjects.zad1.logic.Seniority;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    public static void main(String[] args) {

        List<Employee> employeesList = new ArrayList<>();
        Employee employee1 = new Employee("Adam", "Mickiewicz", 1980, Seniority.SENIOR);
        employeesList.add(employee1);
        Employee employee2 = new Employee("Juliusz", "Słowacki", 1985, Seniority.MID);
        employeesList.add(employee2);
        Employee employee3 = new Employee("Julian", "Tuwim", 1990, Seniority.JUNIOR);
        employeesList.add(employee3);

        System.out.println("List of employees in the company");
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println("Employee nr " + (i + 1) + ": " + employeesList.get(i));

        }
    }
}
