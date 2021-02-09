package BankingApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;
    @BeforeEach
    void setUp() {
        customer= new Customer();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatAllCustomerDetailsAreCorrect(){
        customer.setFirstName("Titi");
        assertEquals("Titi",customer.getFirstName());

        customer.setLastName("Titus");
        assertEquals("Titus",customer.getLastName());

        customer.setOtherName("Damilola");
        assertEquals("Damilola",customer.getOtherName());

        customer.setAddress("Semi-colon");
        assertEquals("Semi-colon",customer.getAddress());

        customer.setPhoneNumber("08066972580");
        assertEquals("08066972580",customer.getPhoneNumber());

        customer.setEmail("Titi@Semicolon");
        assertEquals("Titi@Semicolon",customer.getEmail());
    }

}