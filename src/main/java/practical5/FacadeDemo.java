package practical5;

public class FacadeDemo {

    public static void main(String[] args) {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        facade.register("Ram", 101);
    }
}
