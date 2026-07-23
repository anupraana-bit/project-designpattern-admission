package practical11.good;

public class SubmittedState implements AdmissionState {

    @Override
    public void verify(AdmissionApplication context) {
        context.setState(new VerifiedState());
        System.out.println("Application verified.");
    }

    @Override
    public void approve(AdmissionApplication context) {
        System.out.println("Cannot approve. Current status: SUBMITTED");
    }

    @Override
    public void enroll(AdmissionApplication context) {
        System.out.println("Cannot enroll. Current status: SUBMITTED");
    }

    @Override
    public void reject(AdmissionApplication context) {
        context.setState(new RejectedState());
        System.out.println("Application rejected.");
    }

    @Override
    public String getStatus() {
        return "SUBMITTED";
    }
}
