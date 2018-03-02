

import Model.Bank;
import Model.Customer;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    Bank bank;
    FakeCustomer cust;

    @BeforeEach
    public void setup()
    {
        bank = new Bank("MyBank");
        cust = new FakeCustomer(1,123,"Kwan");
        bank.addCustomer(cust);
    }

    class FakeCustomer extends Customer{
        public FakeCustomer(int id,int pin,String name){
            super(id,pin,name);
        }
        public void complexMethod()
        {

        }
    }
}