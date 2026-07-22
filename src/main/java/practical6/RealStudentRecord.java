package practical6;

public class RealStudentRecord implements StudentRecord {

    @Override
    public void viewMarks(String studentName, String role) {
        System.out.println("Marks for " + studentName + ": Math=85, Science=90, English=88");
    }
}
