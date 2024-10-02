package Exercise1.BehavioralDesignPattern.Usecase2;

import java.util.logging.Logger;

public class PayPalPayment implements PaymentStrategy {
    private final String email;
    private static final Logger logger = Logger.getLogger(PayPalPayment.class.getName());

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        logger.info("Processing PayPal payment of $" + amount + " using email: " + email);
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

