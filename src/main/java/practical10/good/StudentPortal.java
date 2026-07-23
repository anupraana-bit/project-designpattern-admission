package practical10.good;

import java.util.ArrayList;
import java.util.List;

public class StudentPortal {

    private List<RequestCommand> requests = new ArrayList<>();

    public void addRequest(RequestCommand command) {
        requests.add(command);
    }

    public void processAllRequests(String studentName) {
        for (RequestCommand command : requests) {
            command.execute(studentName);
        }
    }
}
