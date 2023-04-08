package accounts;

public abstract class Account implements MoneyTarget {
    protected String name;
    protected Account account;
    protected long balance;

    protected Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean pay(long amount) {
        if (balance < amount) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }

    protected abstract boolean add(long amount);

    public boolean transfer(Account accountTo, int amount) {
        if (this.pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                System.out.println("Неудачный перевод: " + amount + " рублей возвращены на счет");
                this.balance = balance + amount;
                return false;
            }
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    protected abstract boolean accept(int money);

}