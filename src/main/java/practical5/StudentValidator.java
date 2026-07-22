package practical5;

public class StudentValidator {

    public boolean validate(String name, int id) {
        if (name == null || name.isEmpty()) {
            System.out.println("Validation failed: Name is empty.");
            return false;
        }
        if (id <= 0) {
            System.out.println("Validation failed: Invalid ID.");
            return false;
        }
        System.out.println("Student validated successfully.");
        return true;
    }
}
