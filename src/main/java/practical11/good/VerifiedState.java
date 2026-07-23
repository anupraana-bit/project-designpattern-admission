package practical11.good;

public class VerifiedState implements AdmissionState {

    @Override
    public void verify(AdmissionApplication context) {
        System.out.println("Already verified.");
    }

    @Override
    public void approve(AdmissionApplication context) {
        context.setState(new ApprovedState());
        System.out.println("Application approved.");
    }

    @Override
    public void enroll(AdmissionApplication context) {
        System.out.println("Cannot enroll. Current status: VERIFIED");
    }

    @Override
    public void reject(AdmissionApplication context) {
        context.setState(new RejectedState());
        System.out.println("Application rejected.");
    }

    @Override
    public String getStatus() {
        return "VERIFIED";
    }
}
