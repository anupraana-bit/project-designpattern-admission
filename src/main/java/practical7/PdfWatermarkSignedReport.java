package practical7;

public class PdfWatermarkSignedReport extends BasicReport {

    @Override
    public String generate() {
        return super.generate() + " [PDF Format] [Watermark Added] [Signed]";
    }
}
