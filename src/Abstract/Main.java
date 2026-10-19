package Abstract;

public class Main {
    static void main() {
        SavingAccount acc = new SavingAccount();
        CurrentAccount acc2 = new CurrentAccount();
        
        acc.withdraw(100);
        acc2.withdraw(200);
    }
}
