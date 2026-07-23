package practical11.good;

public class AdmissionApplication {

    private AdmissionState state;

    public AdmissionApplication() {
        this.state = new SubmittedState();
    }

    public void setState(AdmissionState state) {
        this.state = state;
    }

    public AdmissionState getState() {
        return state;
    }

    public String getStatus() {
        return state.getStatus();
    }

    public void verify() {
        state.verify(this);
    }

    public void approve() {
        state.approve(this);
    }

    public void enroll() {
        state.enroll(this);
    }

    public void reject() {
        state.reject(this);
    }
}
