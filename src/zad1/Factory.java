package zad1;

public class Factory {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", "Mickiewicz", 1980, 25);
        Employee employee2 = new Employee("Juliusz", "Słowacki", 1985, 20);
        Employee employee3 = new Employee("Julian", "Tuwim", 1990, 15);

        System.out.println("List of employees in the company");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
