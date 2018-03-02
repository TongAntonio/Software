

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import Model.*;
import org.junit.jupiter.api.Test;

public class BankCustomerTest {

    Bank bank;
    Customer cust;

    @BeforeEach
    public void setUp() {
        bank = new Bank("MyBank");
        cust = new Customer(1,123,"Kwan");
        bank.addCustomer(cust);
    }

    @Test
    void testFindCustomer(){
        Customer found = bank.findCustomerById(1);
        assertNotNull(found);
        assertSame(cust,found);
    }

    @Test
    void testAddAnotherCustomer(){
        Customer anotherCust = new Customer(2,456,"Noon");
        bank.addCustomer(anotherCust);

        Customer found = bank.findCustomerById(2);
        assertNotNull(found);
        assertSame(anotherCust,found);
    }

    @Test
    void testValidateCustomerValid(){
         assertTrue(bank.validateCustomer(1,123));
    }

    @Test
    void TestValidateCustomerNotValid(){
        assertFalse(bank.validateCustomer(1,999));
    }

    @AfterEach
    void tearDown() {
    }
}