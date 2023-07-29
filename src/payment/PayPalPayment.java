package payment;

public class PayPalPayment implements Payment {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        // Implement PayPal payment logic here
        System.out.println("Paid " + amount + " using PayPal.");
    }
}