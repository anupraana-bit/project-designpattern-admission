package practical10.good;

public class IDCardRequest implements RequestCommand {

    @Override
    public void execute(String studentName) {
        System.out.println("Processing ID card request for " + studentName);
    }
}
