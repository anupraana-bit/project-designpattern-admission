package practical3;

import org.junit.jupiter.api.Test;
import practical3.good.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentBuilderTest {

    @Test
    void verifyStudentObjectIsCreatedSuccessfully() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertNotNull(student);
    }

    @Test
    void verifyStudentIdIsCorrect() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertEquals(101, student.getStudentId());
    }

    @Test
    void verifyStudentNameIsCorrect() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertEquals("Ram", student.getName());
    }

    @Test
    void verifyDepartmentIsCorrect() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertEquals("BCA", student.getDepartment());
    }

    @Test
    void verifySemesterIsCorrect() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertEquals(5, student.getSemester());
    }

    @Test
    void verifyEmailIsCorrect() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertEquals("ram@gmail.com", student.getEmail());
    }

    @Test
    void verifyPhoneNumberIsCorrect() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertEquals("9800000000", student.getPhoneNumber());
    }

    @Test
    void verifyAddressIsCorrect() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertEquals("Kathmandu", student.getAddress());
    }

    @Test
    void verifyGuardianNameIsCorrect() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertEquals("Hari", student.getGuardianName());
    }
}
