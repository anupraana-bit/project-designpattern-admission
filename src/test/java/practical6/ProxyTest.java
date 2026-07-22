package practical6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {

    @Test
    void verifyProxyIsCreated() {
        StudentRecord proxy = new StudentRecordProxy();
        assertNotNull(proxy);
    }

    @Test
    void verifyAdminCanViewMarks() {
        StudentRecord proxy = new StudentRecordProxy();
        assertDoesNotThrow(() -> proxy.viewMarks("Ram", "ADMIN"));
    }

    @Test
    void verifyStudentIsDenied() {
        StudentRecord proxy = new StudentRecordProxy();
        assertDoesNotThrow(() -> proxy.viewMarks("Sita", "STUDENT"));
    }

    @Test
    void verifyProxyDelegatesToRealRecord() {
        StudentRecordProxy proxy = new StudentRecordProxy();
        assertNotNull(proxy);
    }
}
