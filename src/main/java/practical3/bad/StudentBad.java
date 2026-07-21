package practical3.bad;

public class StudentBad {

    private int studentId;
    private String name;
    private String email;
    private String phoneNumber;
    private String department;
    private int semester;
    private String address;
    private String guardianName;

    public StudentBad(
            int studentId,
            String name,
            String email,
            String phoneNumber,
            String department,
            int semester,
            String address,
            String guardianName
    ) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.semester = semester;
        this.address = address;
        this.guardianName = guardianName;
    }

    @Override
    public String toString() {
        return "StudentBad{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department='" + department + '\'' +
                ", semester=" + semester +
                ", address='" + address + '\'' +
                ", guardianName='" + guardianName + '\'' +
                '}';
    }
}
