package accounts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestCreditAccount {
    @Test
    public void balanceCannotBePositive() {
        long testPayment = 100;
        CreditAccount testCreditAccount = new CreditAccount("Николай", 3_000);
        Assertions.assertFalse(testCreditAccount.add(testPayment));
    }
}
