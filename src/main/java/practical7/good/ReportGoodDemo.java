package practical7.good;

import java.util.Scanner;

public class ReportGoodDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PCPS College - Report Generator (Decorator) ===");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        StudentReport report = new BasicReport(name);

        System.out.print("Add PDF formatting? (y/n): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
            report = new PdfDecorator(report);
        }

        System.out.print("Add Watermark? (y/n): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
            report = new WatermarkDecorator(report);
        }

        System.out.print("Add Signature? (y/n): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
            report = new SignatureDecorator(report);
        }

        System.out.println();
        System.out.println("Final Report: " + report.generate());

        scanner.close();
    }
}
