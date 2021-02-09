package BankingApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount;
    @BeforeEach
    void setUp() {
       bankAccount=new BankAccount();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatAllGettersAndSettersAreWorking(){
        bankAccount.setDepositAmount(100);
        assertEquals(100,bankAccount.getDepositAmount());
        bankAccount.setWithdrawAmount(100);
        assertEquals(100,bankAccount.getWithdrawAmount());
        assertEquals(0,bankAccount.getBalance());
        bankAccount.setAccountTypes(1);
        assertEquals("Savings",bankAccount.getAccountTypes());
    }
    @Test
    void testBankAccountToStringMethod(){
        bankAccount.setAccountTypes(2);
        bankAccount.setDepositAmount(100);
        System.out.println(bankAccount.toString());
    }
    @Test
    void testForBankAccountTypes(){
        BankAccount bankAccount1= new BankAccount(2);
        assertEquals("Current",bankAccount1.getAccountTypes());
        System.out.println(bankAccount1.getAccountNumber());
        BankAccount bankAccount2= new BankAccount(1);
        assertEquals("Savings",bankAccount2.getAccountTypes());
        System.out.println(bankAccount2.getAccountNumber());

        BankAccount bankAccount3= new BankAccount(1,1000);
        assertEquals("Savings",bankAccount3.getAccountTypes());
        System.out.println(bankAccount3.toString());
    }
}