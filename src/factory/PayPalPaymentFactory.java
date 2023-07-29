package factory;

import payment.PayPalPayment;
import payment.Payment;

public class PayPalPaymentFactory implements PaymentFactory {
    private String email;
    private String password;

    public PayPalPaymentFactory(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public Payment createPayment() {
        return new PayPalPayment(email, password);
    }
}
