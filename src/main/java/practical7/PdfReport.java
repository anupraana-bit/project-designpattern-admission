package practical7;

public class PdfReport extends BasicReport {

    @Override
    public String generate() {
        return super.generate() + " [PDF Format]";
    }
}
