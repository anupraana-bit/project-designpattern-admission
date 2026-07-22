package practical5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void verifyFacadeIsCreated() {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        assertNotNull(facade);
    }

    @Test
    void verifyRegistrationRuns() {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        assertDoesNotThrow(() -> facade.register("Ram", 101));
    }

    @Test
    void verifyValidatorRejectsEmptyName() {
        StudentValidator validator = new StudentValidator();
        assertFalse(validator.validate("", 101));
    }

    @Test
    void verifyRollNumberIsAssigned() {
        RollNumberAssigner assigner = new RollNumberAssigner();
        String roll = assigner.assign();
        assertNotNull(roll);
        assertTrue(roll.startsWith("PCPS-"));
    }
}
