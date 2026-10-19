package Abstract;

public class SavingAccount extends BankAccount{


    public void withdraw(double amount) {
        if(amount > 0 ){
            if((balance - amount) >= 100){
                balance -= amount;
                System.out.println("withdrawn " + amount + " from saving account");
            }
            else
                System.out.println("saving account balance $100 required");
        }
        else
            System.out.println("Amount must be greater than 0 !");
    }
}
