public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        amount+= sum;

    }
    public void withDraw(int sum) throws InsufficientFundsException{
        if (sum > amount) {
            throw new InsufficientFundsException();
        }
        amount -= sum;
    }
}
