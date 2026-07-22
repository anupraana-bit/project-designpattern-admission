package practical6;

import java.util.Scanner;

public class ProxyDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PCPS College - Student Record (Proxy) ===");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Role (ADMIN/STUDENT): ");
        String role = scanner.nextLine().trim().toUpperCase();

        System.out.println();
        StudentRecord proxy = new StudentRecordProxy();
        proxy.viewMarks(name, role);

        scanner.close();
    }
}
