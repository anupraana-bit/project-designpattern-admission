package admission;

import practical1.good.CollegeConfig;
import practical2.good.Notification;
import practical2.good.NotificationFactory;
import practical3.good.Student;

public class StudentAdmission {

    private CollegeConfig config;

    public StudentAdmission() {
        this.config = CollegeConfig.getInstance();
    }

    public void admitStudent(
            int studentId,
            String name,
            String email,
            String phoneNumber,
            String department,
            int semester,
            String address,
            String guardianName,
            String notificationType
    ) {
        System.out.println("=== PCPS College - Student Admission System ===");
        System.out.println("College: " + config.getCollegeName());
        System.out.println("Version: " + config.getSystemVersion());
        System.out.println();

        Student student = new Student.Builder()
                .studentId(studentId)
                .name(name)
                .email(email)
                .phoneNumber(phoneNumber)
                .department(department)
                .semester(semester)
                .address(address)
                .guardianName(guardianName)
                .build();

        System.out.println("Student admitted successfully!");
        System.out.println();

        Notification notification = NotificationFactory.createNotification(notificationType);
        notification.send("Welcome to " + config.getCollegeName()
                + "! Dear " + student.getName()
                + ", your admission has been confirmed. Semester " + student.getSemester()
                + ", Department: " + student.getDepartment() + ".");

        System.out.println();
        System.out.println("Admission process completed.");
    }
}
