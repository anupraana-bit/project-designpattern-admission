package admission;

import practical8.good.*;
import practical9.good.*;
import practical10.good.*;
import practical11.good.*;

import java.util.Scanner;

public class BehavioralPatternsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PCPS College - Student Academic Management System ===");
        System.out.println();

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        // ── Strategy Pattern: Fee Payment ──
        System.out.println();
        System.out.println("--- Fee Payment (Strategy Pattern) ---");
        System.out.println("Select payment method:");
        System.out.println("1. Khalti");
        System.out.println("2. eSewa");
        System.out.println("3. Bank Transfer");
        System.out.print("Choice: ");
        int paymentChoice = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter fee amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        PaymentContext paymentContext;
        switch (paymentChoice) {
            case 1:
                paymentContext = new PaymentContext(new KhaltiPayment());
                break;
            case 2:
                paymentContext = new PaymentContext(new EsewaPayment());
                break;
            case 3:
                paymentContext = new PaymentContext(new BankTransferPayment());
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Khalti.");
                paymentContext = new PaymentContext(new KhaltiPayment());
        }
        paymentContext.executePayment(amount);

        // ── Observer Pattern: Result Notification ──
        System.out.println();
        System.out.println("--- Result Notification (Observer Pattern) ---");
        ResultPublisher resultPublisher = new ResultPublisher();
        resultPublisher.subscribe(new StudentObserver());
        resultPublisher.subscribe(new ParentObserver());
        resultPublisher.subscribe(new DepartmentObserver());

        System.out.print("Enter result for " + studentName + ": ");
        String result = scanner.nextLine();
        resultPublisher.publishResult(studentName, result);

        // ── Command Pattern: Student Service Requests ──
        System.out.println();
        System.out.println("--- Student Service Requests (Command Pattern) ---");
        StudentPortal portal = new StudentPortal();

        System.out.println("Select requests to submit:");
        System.out.println("1. Transcript");
        System.out.println("2. Certificate");
        System.out.println("3. ID Card");
        System.out.println("4. Library Card");
        System.out.print("Enter choices (comma-separated, e.g. 1,2,3): ");
        String[] choices = scanner.nextLine().split(",");

        for (String choice : choices) {
            switch (choice.trim()) {
                case "1":
                    portal.addRequest(new TranscriptRequest());
                    break;
                case "2":
                    portal.addRequest(new CertificateRequest());
                    break;
                case "3":
                    portal.addRequest(new IDCardRequest());
                    break;
                case "4":
                    portal.addRequest(new LibraryCardRequest());
                    break;
                default:
                    System.out.println("Invalid request: " + choice.trim());
            }
        }
        portal.processAllRequests(studentName);

        // ── State Pattern: Admission Status ──
        System.out.println();
        System.out.println("--- Admission Status (State Pattern) ---");
        AdmissionApplication application = new AdmissionApplication();
        System.out.println("Current status: " + application.getStatus());

        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("Available transitions:");
            System.out.println("1. Verify");
            System.out.println("2. Approve");
            System.out.println("3. Enroll");
            System.out.println("4. Reject");
            System.out.println("5. Skip");
            System.out.print("Choice: ");
            int stateChoice = Integer.parseInt(scanner.nextLine());

            switch (stateChoice) {
                case 1:
                    application.verify();
                    break;
                case 2:
                    application.approve();
                    break;
                case 3:
                    application.enroll();
                    break;
                case 4:
                    application.reject();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("Current status: " + application.getStatus());
        }

        System.out.println();
        System.out.println("=== Academic Management Complete ===");
        scanner.close();
    }
}
