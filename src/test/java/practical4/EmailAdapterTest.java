package practical4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailAdapterTest {

    @Test
    void verifyAdapterObjectIsCreated() {
        EmailAdapter adapter = new EmailAdapter(new OldEmailService());
        assertNotNull(adapter);
    }

    @Test
    void verifyNotificationIsSuccessfullySent() {
        EmailAdapter adapter = new EmailAdapter(new OldEmailService());
        assertDoesNotThrow(() -> adapter.sendNotification("Welcome to PCPS College!"));
    }

    @Test
    void verifyAdapterDelegatesRequestCorrectly() {
        OldEmailService oldService = new OldEmailService();
        EmailAdapter adapter = new EmailAdapter(oldService);
        assertSame(oldService, adapter.getOldEmailService());
    }

    @Test
    void verifyAdapterObjectIsNotNull() {
        NotificationService adapter = new EmailAdapter(new OldEmailService());
        assertNotNull(adapter);
    }
}
