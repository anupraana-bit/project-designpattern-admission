package admission;

import java.util.Scanner;

public class AdmissionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentAdmission admission = new StudentAdmission();

        System.out.println("=== PCPS College - Student Admission System ===");
        System.out.println();

        System.out.print("Enter Student ID: ");
        int studentId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Semester: ");
        int semester = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Guardian Name: ");
        String guardianName = scanner.nextLine();

        System.out.print("Enter Notification Type (EMAIL/SMS/PUSH): ");
        String notificationType = scanner.nextLine();

        System.out.println();
        admission.admitStudent(
                studentId,
                name,
                email,
                phoneNumber,
                department,
                semester,
                address,
                guardianName,
                notificationType
        );

        scanner.close();
    }
}
