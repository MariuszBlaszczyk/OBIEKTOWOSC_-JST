package staticcomponents.zad1.logic;

public record Student(String firstname, String lastName, int indexNumber) {

    private static int studentsCounter;

    public Student(String firstname, String lastName, int indexNumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        studentsCounter++;
    }

    public static int getStudentsCounter() {
        return studentsCounter;
    }
}
