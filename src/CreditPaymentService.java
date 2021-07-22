public class CreditPaymentService {
    public int calculate(int loanAmount, double interestRate, int quantityMonth) {
        interestRate = interestRate / 100 / 12;
        double monthlyPayment = loanAmount * (interestRate * (Math.pow((1 + interestRate), quantityMonth))  / (Math.pow((1 + interestRate), quantityMonth) - 1));
        return (int) monthlyPayment;
    }
}
