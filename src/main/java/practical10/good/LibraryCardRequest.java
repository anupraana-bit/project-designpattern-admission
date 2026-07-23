package practical10.good;

public class LibraryCardRequest implements RequestCommand {

    @Override
    public void execute(String studentName) {
        System.out.println("Processing library card request for " + studentName);
    }
}
