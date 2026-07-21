package practical3.good;

public class BuilderGoodDemo {

    public static void main(String[] args) {
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

        System.out.println(student);
    }
}
