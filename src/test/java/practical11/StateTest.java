package practical11;

import org.junit.jupiter.api.Test;
import practical11.good.*;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    void verifyInitialStateIsSubmitted() {
        AdmissionApplication app = new AdmissionApplication();
        assertEquals("SUBMITTED", app.getStatus());
    }

    @Test
    void verifyTransitionToVerified() {
        AdmissionApplication app = new AdmissionApplication();
        app.verify();
        assertEquals("VERIFIED", app.getStatus());
    }

    @Test
    void verifyTransitionToApproved() {
        AdmissionApplication app = new AdmissionApplication();
        app.verify();
        app.approve();
        assertEquals("APPROVED", app.getStatus());
    }

    @Test
    void verifyTransitionToEnrolled() {
        AdmissionApplication app = new AdmissionApplication();
        app.verify();
        app.approve();
        app.enroll();
        assertEquals("ENROLLED", app.getStatus());
    }

    @Test
    void verifyStateObjectIsNotNull() {
        AdmissionApplication app = new AdmissionApplication();
        assertNotNull(app.getState());
    }
}
