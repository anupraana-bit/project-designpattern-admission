package practical9.good;

public class ParentObserver implements ResultObserver {

    @Override
    public void update(String studentName, String result) {
        System.out.println("Parent of " + studentName + " received notification: Result = " + result);
    }
}
