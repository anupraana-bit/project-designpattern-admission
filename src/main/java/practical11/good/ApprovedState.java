package practical11.good;

public class ApprovedState implements AdmissionState {

    @Override
    public void verify(AdmissionApplication context) {
        System.out.println("Already verified.");
    }

    @Override
    public void approve(AdmissionApplication context) {
        System.out.println("Already approved.");
    }

    @Override
    public void enroll(AdmissionApplication context) {
        context.setState(new EnrolledState());
        System.out.println("Student enrolled.");
    }

    @Override
    public void reject(AdmissionApplication context) {
        System.out.println("Cannot reject. Current status: APPROVED");
    }

    @Override
    public String getStatus() {
        return "APPROVED";
    }
}
