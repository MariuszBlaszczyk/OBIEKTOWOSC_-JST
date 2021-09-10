package staticcomponents.zad1.main;

import staticcomponents.zad1.logic.Student;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Student student1 = new Student("Bogusław", "Linda", 12345);
        Student student2 = new Student("Cezary", "Pazura", 67890);
        System.out.println("The number of students is " + Student.getStudentsCounter() + ".");


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println("<Map> The number of students is " + students.size() + ".");
     }
}
