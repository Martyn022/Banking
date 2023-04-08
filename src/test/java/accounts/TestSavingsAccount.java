package accounts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestSavingsAccount {
    @Test
    public void accountMustMaintainMinimalBalance() {
        long testMinimalBalance = 1_000;
        long exceedingTheMinimumBalance = 2_000;
        SavingsAccount testSavingAccount = new SavingsAccount("Михаил", testMinimalBalance);
        Assertions.assertFalse(testSavingAccount.pay(exceedingTheMinimumBalance));
    }
}
