package practical5;

import java.util.Scanner;

public class FacadeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PCPS College - Student Registration (Facade) ===");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println();
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        facade.register(name, id);

        scanner.close();
    }
}
