package polymorphism.zad1.main;

import polymorphism.zad1.model.Doctor;
import polymorphism.zad1.model.Hospital;
import polymorphism.zad1.model.Nurse;


import java.math.BigDecimal;

public class HospitalApp {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.addEmployeeToArray(new Doctor("Leon", "Ważka",
                new BigDecimal("8000"), new BigDecimal("2000")));
        hospital.addEmployeeToArray(new Nurse("Jolanta", "Beczka",
                new BigDecimal("5000"), 55.5));
        hospital.addEmployeeToArray(new Nurse("Ewa", "Zielona",
                new BigDecimal("6000"), 35.5));
        System.out.println("ARRAY");
        System.out.println(hospital.getInfo());


        System.out.println();

        System.out.println("LIST");
        hospital.addEmployeeToList(new Doctor("Leon", "Ważka",
                new BigDecimal("8000"), new BigDecimal("2000")));
        hospital.addEmployeeToList(new Nurse("Jolanta", "Beczka",
                new BigDecimal("5000"), 55.5));
        hospital.addEmployeeToList(new Nurse("Ewa", "Zielona",
                new BigDecimal("6000"), 35.5));

       hospital.getEmployeesList();
    }
}
