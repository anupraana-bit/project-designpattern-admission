package practical8.good;

public class BankTransferPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying Rs. " + amount + " using Bank Transfer");
    }
}
