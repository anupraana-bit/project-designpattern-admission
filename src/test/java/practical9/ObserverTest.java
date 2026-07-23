package practical9;

import org.junit.jupiter.api.Test;
import practical9.good.*;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void verifyStudentReceivesNotification() {
        ResultPublisher publisher = new ResultPublisher();
        StudentObserver student = new StudentObserver();
        publisher.subscribe(student);
        assertDoesNotThrow(() -> publisher.publishResult("Ram", "A"));
    }

    @Test
    void verifyParentReceivesNotification() {
        ResultPublisher publisher = new ResultPublisher();
        ParentObserver parent = new ParentObserver();
        publisher.subscribe(parent);
        assertDoesNotThrow(() -> publisher.publishResult("Ram", "B+"));
    }

    @Test
    void verifyDepartmentReceivesNotification() {
        ResultPublisher publisher = new ResultPublisher();
        DepartmentObserver department = new DepartmentObserver();
        publisher.subscribe(department);
        assertDoesNotThrow(() -> publisher.publishResult("Ram", "A"));
    }

    @Test
    void verifyObserverRegistrationWorks() {
        ResultPublisher publisher = new ResultPublisher();
        StudentObserver student = new StudentObserver();
        publisher.subscribe(student);
        assertDoesNotThrow(() -> publisher.publishResult("Sita", "A+"));
    }

    @Test
    void verifyObserverRemovalWorks() {
        ResultPublisher publisher = new ResultPublisher();
        StudentObserver student = new StudentObserver();
        publisher.subscribe(student);
        publisher.unsubscribe(student);
        assertDoesNotThrow(() -> publisher.publishResult("Sita", "A+"));
    }
}
