package practical9.bad;

public class ResultServiceBad {

    private String result;

    public void publishResult(String studentName, String result) {
        this.result = result;
        System.out.println("Sending email notification to student " + studentName + ": Result = " + result);
        System.out.println("Sending email notification to parent of " + studentName + ": Result = " + result);
        System.out.println("Sending notification to department: " + studentName + " scored " + result);
    }
}
