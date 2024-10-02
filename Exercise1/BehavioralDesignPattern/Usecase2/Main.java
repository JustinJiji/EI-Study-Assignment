package Exercise1.BehavioralDesignPattern.Usecase2;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card payment
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.pay(100.50);

        // Using PayPal payment
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.pay(200.75);

        // Handling error scenario where no strategy is set
        try {
            PaymentContext noStrategyContext = new PaymentContext();
            noStrategyContext.pay(300);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
