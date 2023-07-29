package payment;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        // Implement credit card payment logic here
        System.out.println("Paid " + amount + " using credit card.");
    }
}
