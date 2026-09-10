public class Payment {

    private int paymentId;
    private double amount;
    private String paymentDate;
    private String paymentMethod;
    private String status;

    public Payment(int paymentId, double amount, String paymentDate,
                   String paymentMethod, String status) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public void processPayment() {
        status = "Completed";
        System.out.println("Payment processed successfully.");
    }

    public void cancelPayment() {
        status = "Cancelled";
        System.out.println("Payment cancelled.");
    }

    public void displayPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Status: " + status);
    }
}
