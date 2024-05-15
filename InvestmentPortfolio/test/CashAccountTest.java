import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CashAccountTest {
    CashAccount f;

    @Before
    public void setUp(){
        f = new CashAccount("Sharon","12345", new Money(10000));
    }

    @Test
    public void testGetters() {
        assertEquals("Sharon",f.getName());
        assertEquals("12345",f.getAccountNum());
        assertEquals(10000, f.getPrice());
    }

    @Test
    public void testSetters() {
        f.setName("Lacy");
        assertEquals("Lacy", f.getName());
        f.setAccountNum("9903");
        assertEquals("9903", f.getAccountNum());
        f.setPrice(new Money(11000));
        assertEquals(11000, f.getPrice());
    }


}