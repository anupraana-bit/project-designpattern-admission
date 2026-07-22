package practical7;

public class PdfSignedReport extends BasicReport {

    @Override
    public String generate() {
        return super.generate() + " [PDF Format] [Signed]";
    }
}
