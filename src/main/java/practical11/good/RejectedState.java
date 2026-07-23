package practical11.good;

public class RejectedState implements AdmissionState {

    @Override
    public void verify(AdmissionApplication context) {
        System.out.println("Cannot verify. Application is rejected.");
    }

    @Override
    public void approve(AdmissionApplication context) {
        System.out.println("Cannot approve. Application is rejected.");
    }

    @Override
    public void enroll(AdmissionApplication context) {
        System.out.println("Cannot enroll. Application is rejected.");
    }

    @Override
    public void reject(AdmissionApplication context) {
        System.out.println("Already rejected.");
    }

    @Override
    public String getStatus() {
        return "REJECTED";
    }
}
