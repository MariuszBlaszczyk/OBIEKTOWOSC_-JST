package encapsulation.zad2.model;

public record Client(String firstName, String lastName, int age) {

    String getFullName() {
        return firstName + " " + lastName;
    }
}
