import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Client;

public class Main {

    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount("Пушкин", 600_000);
        Account savingsAccount = new SavingsAccount("Лермонтов", 400_000);
        Account creditAccount = new CreditAccount("Некрасов", 450_000);

        System.out.println(checkingAccount.pay(200_000));
        System.out.println(savingsAccount.pay(100_000));
        System.out.println(creditAccount.pay(150_000));

        Client client = new Client("Пушкин", 5);
        System.out.println(client.pay(3_000));

        Account savingsAccount1 = new SavingsAccount("Сбережения", 5_000);
        Account creditAccount1 = new CheckingAccount("Кредит", -1_000);

        System.out.println(savingsAccount1.getBalance());
        System.out.println(creditAccount1.getBalance());

        boolean b = savingsAccount1.transfer(creditAccount1, 500);
        System.out.println(b);
        System.out.println(savingsAccount1.getBalance());
        System.out.println(creditAccount1.getBalance());
    }

}
