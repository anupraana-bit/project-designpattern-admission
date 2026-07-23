package practical10.good;

public class TranscriptRequest implements RequestCommand {

    @Override
    public void execute(String studentName) {
        System.out.println("Processing transcript request for " + studentName);
    }
}
