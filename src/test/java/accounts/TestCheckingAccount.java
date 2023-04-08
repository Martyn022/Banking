package accounts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestCheckingAccount {
    @Test
    @DisplayName("У аккаунта минимальный баланс 0, ниже минимума платить нельзя.")
    public void accountMustMaintainPositiveBalance() {
        CheckingAccount testCheckingAccount = new CheckingAccount("Александр", 300);
        long testPaymentAmount = 2_000;
        Assertions.assertFalse(testCheckingAccount.pay(testPaymentAmount));
    }
}
