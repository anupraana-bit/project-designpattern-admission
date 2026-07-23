package practical8;

import org.junit.jupiter.api.Test;
import practical8.good.*;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void verifyKhaltiPaymentExecuted() {
        PaymentContext context = new PaymentContext(new KhaltiPayment());
        assertDoesNotThrow(() -> context.executePayment(1000));
    }

    @Test
    void verifyEsewaPaymentExecuted() {
        PaymentContext context = new PaymentContext(new EsewaPayment());
        assertDoesNotThrow(() -> context.executePayment(2000));
    }

    @Test
    void verifyBankTransferPaymentExecuted() {
        PaymentContext context = new PaymentContext(new BankTransferPayment());
        assertDoesNotThrow(() -> context.executePayment(3000));
    }

    @Test
    void verifyPaymentStrategyIsNotNull() {
        PaymentStrategy strategy = new KhaltiPayment();
        assertNotNull(strategy);
    }

    @Test
    void verifyStrategyCanChangeAtRuntime() {
        PaymentContext context = new PaymentContext(new KhaltiPayment());
        context.setStrategy(new EsewaPayment());
        assertDoesNotThrow(() -> context.executePayment(1500));
    }
}
