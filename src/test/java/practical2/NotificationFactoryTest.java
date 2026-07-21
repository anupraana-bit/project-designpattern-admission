package practical2;

import org.junit.jupiter.api.Test;
import practical2.good.*;

import static org.junit.jupiter.api.Assertions.*;

class NotificationFactoryTest {

    @Test
    void verifyEmailNotificationObjectIsCreated() {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    void verifySmsNotificationObjectIsCreated() {
        Notification notification = NotificationFactory.createNotification("SMS");
        assertTrue(notification instanceof SmsNotification);
    }

    @Test
    void verifyPushNotificationObjectIsCreated() {
        Notification notification = NotificationFactory.createNotification("PUSH");
        assertTrue(notification instanceof PushNotification);
    }

    @Test
    void verifyNotificationObjectIsNotNull() {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        assertNotNull(notification);
    }

    @Test
    void verifyInvalidNotificationTypeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            NotificationFactory.createNotification("FAX");
        });
    }
}
