package Exercise1.BehavioralDesignPattern.Usecase2;

import java.util.logging.Logger;

public class PaymentContext {
    private PaymentStrategy strategy;
    private static final Logger logger = Logger.getLogger(PaymentContext.class.getName());

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
        logger.info("Payment strategy set: " + strategy.getClass().getSimpleName());
    }

    public void pay(double amount) {
        if (strategy == null) {
            logger.warning("Payment strategy not set!");
            throw new IllegalStateException("Payment strategy not set.");
        }
        strategy.pay(amount);
    }
}
