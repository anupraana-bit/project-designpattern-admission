package practical7.good;

public class WatermarkDecorator extends ReportDecorator {

    public WatermarkDecorator(StudentReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return report.generate() + " [Watermark Added]";
    }
}
