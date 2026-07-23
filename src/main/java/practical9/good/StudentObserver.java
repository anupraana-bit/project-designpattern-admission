package practical9.good;

public class StudentObserver implements ResultObserver {

    @Override
    public void update(String studentName, String result) {
        System.out.println("Student " + studentName + " received notification: Result = " + result);
    }
}
