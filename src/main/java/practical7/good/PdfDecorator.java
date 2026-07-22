package practical7.good;

public class PdfDecorator extends ReportDecorator {

    public PdfDecorator(StudentReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return report.generate() + " [PDF Format]";
    }
}
