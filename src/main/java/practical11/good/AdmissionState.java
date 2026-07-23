package practical11.good;

public interface AdmissionState {
    void verify(AdmissionApplication context);
    void approve(AdmissionApplication context);
    void enroll(AdmissionApplication context);
    void reject(AdmissionApplication context);
    String getStatus();
}
