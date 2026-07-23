package practical9.good;

public class DepartmentObserver implements ResultObserver {

    @Override
    public void update(String studentName, String result) {
        System.out.println("Department received notification: " + studentName + " scored " + result);
    }
}
