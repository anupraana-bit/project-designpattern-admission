package practical7.good;

public class SignatureDecorator extends ReportDecorator {

    public SignatureDecorator(StudentReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return report.generate() + " [Signed]";
    }
}
