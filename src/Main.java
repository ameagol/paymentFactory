import factory.CreditCardPaymentFactory;
import factory.PayPalPaymentFactory;
import factory.PaymentFactory;
import payment.Payment;

public class Main {
    public static void main(String[] args) {
        PaymentFactory creditCardPaymentFactory = new CreditCardPaymentFactory("1234-5678-9876-5432", "12/24", "123");
        Payment creditCardPayment = creditCardPaymentFactory.createPayment();
        creditCardPayment.pay(100.0);

        PaymentFactory payPalPaymentFactory = new PayPalPaymentFactory("paypal@example.com", "secretpassword");
        Payment payPalPayment = payPalPaymentFactory.createPayment();
        payPalPayment.pay(50.0);
    }
}