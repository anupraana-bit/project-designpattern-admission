package practical4;

public class AdapterDemo {

    public static void main(String[] args) {
        OldEmailService oldService = new OldEmailService();
        NotificationService adapter = new EmailAdapter(oldService);

        adapter.sendNotification("Welcome to PCPS College!");
    }
}
