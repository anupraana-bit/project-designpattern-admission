package practical6;

public class ProxyDemo {

    public static void main(String[] args) {
        StudentRecord proxy = new StudentRecordProxy();

        System.out.println("=== Admin Access ===");
        proxy.viewMarks("Ram", "ADMIN");

        System.out.println();
        System.out.println("=== Student Access ===");
        proxy.viewMarks("Sita", "STUDENT");
    }
}
