package practical11.good;

public class EnrolledState implements AdmissionState {

    @Override
    public void verify(AdmissionApplication context) {
        System.out.println("Already enrolled.");
    }

    @Override
    public void approve(AdmissionApplication context) {
        System.out.println("Already enrolled.");
    }

    @Override
    public void enroll(AdmissionApplication context) {
        System.out.println("Already enrolled.");
    }

    @Override
    public void reject(AdmissionApplication context) {
        System.out.println("Cannot reject. Current status: ENROLLED");
    }

    @Override
    public String getStatus() {
        return "ENROLLED";
    }
}
