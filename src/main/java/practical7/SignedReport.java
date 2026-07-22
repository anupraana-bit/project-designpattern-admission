package practical7;

public class SignedReport extends BasicReport {

    @Override
    public String generate() {
        return super.generate() + " [Signed]";
    }
}
