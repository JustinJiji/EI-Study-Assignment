package Exercise1.BehavioralDesignPattern.Usecase2;

import java.util.logging.Logger;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private static final Logger logger = Logger.getLogger(CreditCardPayment.class.getName());

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        logger.info("Processing credit card payment of $" + amount + " using card: " + cardNumber);
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
