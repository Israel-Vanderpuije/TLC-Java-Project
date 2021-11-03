public class StudentNotFoundException extends Exception {

    // Constructor for exception
    public StudentNotFoundException(String name_not_found) {
        System.out.println(name_not_found);
    }
}
