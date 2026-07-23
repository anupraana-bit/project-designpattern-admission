package practical11.bad;

public class AdmissionBad {

    private String status;

    public AdmissionBad() {
        this.status = "SUBMITTED";
    }

    public String getStatus() {
        return status;
    }

    public void verify() {
        if (status.equalsIgnoreCase("SUBMITTED")) {
            status = "VERIFIED";
            System.out.println("Application verified.");
        } else {
            System.out.println("Cannot verify. Current status: " + status);
        }
    }

    public void approve() {
        if (status.equalsIgnoreCase("VERIFIED")) {
            status = "APPROVED";
            System.out.println("Application approved.");
        } else {
            System.out.println("Cannot approve. Current status: " + status);
        }
    }

    public void enroll() {
        if (status.equalsIgnoreCase("APPROVED")) {
            status = "ENROLLED";
            System.out.println("Student enrolled.");
        } else {
            System.out.println("Cannot enroll. Current status: " + status);
        }
    }

    public void reject() {
        if (status.equalsIgnoreCase("SUBMITTED") || status.equalsIgnoreCase("VERIFIED")) {
            status = "REJECTED";
            System.out.println("Application rejected.");
        } else {
            System.out.println("Cannot reject. Current status: " + status);
        }
    }
}
