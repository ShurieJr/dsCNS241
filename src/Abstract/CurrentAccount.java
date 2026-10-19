package Abstract;

public class CurrentAccount extends BankAccount{

    @Override
    public void withdraw(double amount) {
        if(amount > 0 ){
            if(amount <= balance){
                balance -= amount;
                System.out.println("withdrawn " + amount + " from current account");
            }
            else
                System.out.println("Haraagaagu kuguma filna!");
        }
        else
            System.out.println("Amount must be greater than 0 !");
    }
}
