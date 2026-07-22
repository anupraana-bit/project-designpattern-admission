package practical6;

public class StudentRecordProxy implements StudentRecord {

    private RealStudentRecord realRecord;

    public StudentRecordProxy() {
        this.realRecord = new RealStudentRecord();
    }

    @Override
    public void viewMarks(String studentName, String role) {
        if (role.equalsIgnoreCase("ADMIN")) {
            realRecord.viewMarks(studentName, role);
        } else {
            System.out.println("Access denied. Only ADMIN can view marks.");
        }
    }
}
