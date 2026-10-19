package Abstract;

public abstract class BankAccount {
    protected double balance;

    public BankAccount(){
        balance = 200;
    }
    public BankAccount(double amount){
        balance  = amount;
    }

    public double getBalance() {
        return balance;
    }

    //concrete method
    public void deposit(double amount){
        if(amount > 0)
            balance += amount;
        else
            System.out.println("amount must be greater than 0");
    }

    //abstract method
    public abstract void withdraw(double amount);
}
