package clients;

import accounts.Account;
import accounts.MoneyTarget;

public class Client implements MoneyTarget {
    protected String name;
    private Account[] accounts;
    protected int maxAccounts;

    public Client(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                System.out.println("Платеж на сумму " + amount + " выполнен!");
                return true;
            } else {
                System.out.println("Деньги на счету, закончились.");
            }
        }
        return false;
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счета нет!");
    }

    @Override
    public boolean accept(Account money) {
        return false;
    }

}