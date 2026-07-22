package practical7;

public class PdfWatermarkReport extends BasicReport {

    @Override
    public String generate() {
        return super.generate() + " [PDF Format] [Watermark Added]";
    }
}
