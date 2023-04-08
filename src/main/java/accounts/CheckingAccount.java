package accounts;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, long balance) {
        super(name, balance);
        int minBalance = 0;
    }

    @Override
    public boolean pay(long amount) {
        if (balance > amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        if (amount >= 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accept(int money) {
        return false;
    }

    @Override
    public boolean accept(Account money) {
        return false;
    }

}