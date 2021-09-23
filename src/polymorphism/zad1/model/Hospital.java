package polymorphism.zad1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hospital {

    private static final int MAX_EMPLOYEES = 3;

    private Person[] employeesArray = new Person[MAX_EMPLOYEES];
    private int employeesNumber = 0;

    public void addEmployeeToArray(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("No data on the employee");
        }
        if (employeesNumber < MAX_EMPLOYEES) {
            employeesArray[employeesNumber] = person;
            employeesNumber++;
        } else {
            System.out.println("No more employees can be added");
        }
    }

    public String getInfo() {
        String employee = "";
        System.out.println("Hospital employees");
        for (int i = 0; i < employeesNumber; i++) {
            employee += employeesArray[i].toString() + "\n";
        }
        return employee;
    }


    List<Person> employeesList = new ArrayList<>();

    public void addEmployeeToList(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("No data on the employee");
        }
        employeesList.add(person);
    }

    public void getEmployeesList() {
        System.out.println("Hospital employees");
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println(employeesList.get(i));
        }
    }
}



