package practical8.bad;

public class PaymentBad {

    private double amount;

    public PaymentBad(double amount) {
        this.amount = amount;
    }

    public void pay(String method) {
        if (method.equalsIgnoreCase("KHALTI")) {
            System.out.println("Paying Rs. " + amount + " using Khalti");
        } else if (method.equalsIgnoreCase("ESEWA")) {
            System.out.println("Paying Rs. " + amount + " using eSewa");
        } else if (method.equalsIgnoreCase("BANK")) {
            System.out.println("Paying Rs. " + amount + " using Bank Transfer");
        } else {
            throw new IllegalArgumentException("Invalid payment method: " + method);
        }
    }
}
