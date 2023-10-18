package WO8.UnitTests2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AccountTest {

    private Account account = null;

    @BeforeEach
    void setUp() {
        account = new Account(100);
    }

    @Test
    void getBalance() {
        assert(account.getBalance() == 100);
    }

    @Test
    void withdrawStandard() {
        account.withdraw(50);
        assert(account.getBalance() == 50);
    }

    @Test
    void withdrawOverdraw() {
        account.withdraw(101);
        assert(account.getBalance() == 100);
    }

    @Test
    void deposit() {
        account.deposit(100);
        assert(account.getBalance() == 200);
    }
}