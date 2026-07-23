package practical10;

import org.junit.jupiter.api.Test;
import practical10.good.*;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    void verifyTranscriptRequestExecuted() {
        RequestCommand command = new TranscriptRequest();
        assertDoesNotThrow(() -> command.execute("Ram"));
    }

    @Test
    void verifyCertificateRequestExecuted() {
        RequestCommand command = new CertificateRequest();
        assertDoesNotThrow(() -> command.execute("Ram"));
    }

    @Test
    void verifyIDCardRequestExecuted() {
        RequestCommand command = new IDCardRequest();
        assertDoesNotThrow(() -> command.execute("Ram"));
    }

    @Test
    void verifyLibraryCardRequestExecuted() {
        RequestCommand command = new LibraryCardRequest();
        assertDoesNotThrow(() -> command.execute("Ram"));
    }

    @Test
    void verifyCommandObjectIsNotNull() {
        RequestCommand command = new TranscriptRequest();
        assertNotNull(command);
    }
}
