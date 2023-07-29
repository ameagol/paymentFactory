package factory;

import payment.CreditCardPayment;
import payment.Payment;

public class CreditCardPaymentFactory implements PaymentFactory {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPaymentFactory(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public Payment createPayment() {
        return new CreditCardPayment(cardNumber, expirationDate, cvv);
    }
}