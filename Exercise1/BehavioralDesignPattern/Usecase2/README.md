# Use Case: Payment System with Multiple Payment Methods
## Description
This project implements an online payment system where users can select different payment methods (Credit Card, PayPal, etc.) at runtime.

## Structure
- `PaymentStrategy`: The interface defining the payment method strategy.
- `CreditCardPayment` and `PayPalPayment`: Concrete implementations of `PaymentStrategy`.
- `PaymentContext`: A class that uses a `PaymentStrategy` to process payments based on the selected strategy.