package BankingApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;
    @BeforeEach
    void setUp() {

        bankAccount = new BankAccount();
    }

    @AfterEach
    void tearDown() {
    }
}