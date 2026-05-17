class BankAccount {
    private int balance = 1000;

    private void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public void accessBalance() {
        showBalance(); // private method ko class ke andar use kar sakte ho
    }
}

public class Private {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        // b.showBalance();  Error: private method
        b.accessBalance(); //  Accessible through public method
    }
}
