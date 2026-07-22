package practical4;

import java.util.Scanner;

public class AdapterDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PCPS College - Notification System (Adapter) ===");
        System.out.print("Enter message to send: ");
        String message = scanner.nextLine();

        OldEmailService oldService = new OldEmailService();
        NotificationService adapter = new EmailAdapter(oldService);

        adapter.sendNotification(message);

        scanner.close();
    }
}
