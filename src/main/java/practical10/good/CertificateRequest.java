package practical10.good;

public class CertificateRequest implements RequestCommand {

    @Override
    public void execute(String studentName) {
        System.out.println("Processing certificate request for " + studentName);
    }
}
