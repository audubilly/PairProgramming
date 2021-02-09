package BankingApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank;
    Customer customer;

    @BeforeEach
    void setUp() {
        bank= new Bank();

    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatABankCanHaveCustomers(){
        customer=new Customer("Titus","damilola","Titi","Semi-colon","Semi-colon@africa","08023544069");
        bank.setCustomers(customer);
        assertEquals(customer,bank.getCustomers()[0]);
    }
    @Test
    void testThatTwoCustomersAreNotAssignedTheSameSpot(){
        customer=new Customer("Titus","damilola","Titi","Semi-colon","Semi-colon@africa","08023544069");
        bank.setCustomers(customer);
        Customer customer2=new Customer("Titu","damilola","Titi","Semi-colon","Semi-colon@africa","08023544069");
        bank.setCustomers(customer2);
        assertEquals(customer,bank.getCustomers()[0]);
        assertEquals(customer2,bank.getCustomers()[1]);

    }
}