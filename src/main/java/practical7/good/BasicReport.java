package practical7.good;

public class BasicReport implements StudentReport {

    @Override
    public String generate() {
        return "Student Report: Name=Ram, Marks=85, Dept=BCA";
    }
}
