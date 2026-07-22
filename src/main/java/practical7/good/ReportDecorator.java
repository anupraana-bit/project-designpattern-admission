package practical7.good;

public abstract class ReportDecorator implements StudentReport {

    protected StudentReport report;

    public ReportDecorator(StudentReport report) {
        this.report = report;
    }

    @Override
    public String generate() {
        return report.generate();
    }
}
