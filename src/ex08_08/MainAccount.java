package ex08_08;

public class MainAccount {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        System.out.printf("잔액 : %d\n", acc.getBalance());
        acc.deposit(500);
        System.out.printf("잔액 : %d\n", acc.getBalance());
        acc.withdraw(500);
        System.out.printf("잔액 : %d\n", acc.getBalance());
    }
}

class Account {
    private int balance;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
}