package classobjects.zad1.model;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> employeesList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public boolean removeEmployee(Employee employee) {
        employeesList.remove(employee);
        return true;
    }

    public void showEmployeesList() {
        System.out.println("List of employees in the company");
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println("Employee nr " + (i + 1) + ": " + employeesList.get(i));
        }
    }

}
