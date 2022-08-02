package Throw;

public class BalanceManager {
    private double balance = 100;

    public void deposit(double amount){
        balance +=amount;
    }

    public void withdraw(double amount) throws BalanceException {
        if (balance>=amount){
            balance -=amount;
        }else{
            throw new BalanceException("Bakiye yetersiz");
        }

    }

    public void getBalance() {
       System.out.println(balance);
    }
}
