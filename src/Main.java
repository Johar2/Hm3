public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0.0);
        System.out.println("Текущий остаток на счете: " + account.getAmount()); // 0.0

        account.deposit(20000.0);
        System.out.println("Текущий остаток на счете после внесения 20 000 сом: " + account.getAmount()); // 20000.0

        while (true) {
            try {
                account.withDraw((int) 6000.0);
                System.out.println("Снятие 6 000 сом со счета выполнено успешно, текущий остаток: " + account.getAmount());
            } catch (InsufficientFundsException e) {
                double remainingAmount = account.getAmount();
                System.out.println("Недостаточно средств на счете для снятия 6 000 сом, доступно только " + remainingAmount + " сом");
                break;
            }
        }
    }
}
