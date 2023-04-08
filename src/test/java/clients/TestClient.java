package clients;
import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestClient {
    private Account testAccount1;
    private CreditAccount testAccount2;
    private Client testClient;

    @BeforeEach
    public void createNewAccountsAndClient() {
        int maximumNumberOfAccountsInClient = 1;
        testClient = new Client("Александр", maximumNumberOfAccountsInClient);
        testAccount1 = new CheckingAccount("Михаил", 4);
        testAccount2 = new CreditAccount("Николай", 3);
    }

    @Test
    @DisplayName("Клиент не может превышать указанное количество учетных записей")
    public void doNotExceedTheNumberOfAccounts() {
        testClient.add(testAccount1);
        assertFalse(testClient.accept(testAccount2));
    }
}
