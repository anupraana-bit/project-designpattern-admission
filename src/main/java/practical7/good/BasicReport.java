package practical7.good;

public class BasicReport implements StudentReport {

    private String name;

    public BasicReport(String name) {
        this.name = name;
    }

    @Override
    public String generate() {
        return "Student Report: Name=" + name + ", Marks=85, Dept=BCA";
    }
}
