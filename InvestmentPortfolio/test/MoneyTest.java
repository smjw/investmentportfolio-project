import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
    //private Sterling a;
    Money a;
    Money b;

    @Before
    public void setUp(){
        a = new Money(100);
        b = new Money(80);
    }

    @Test
    public void testAddValue() {
        a.addValue(50);
        assertEquals(150,a.getValue());
    }

    @Test
    public void testPercentChange() {
        a.percentChange(10);
        assertEquals(110,a.getValue());
    }

    @Test
    public void testGetValue() {
        assertEquals(100,a.getValue());
    }

    @Test
    public void testAddToValue() {

        a.addValue(10);
    }

    @Test
    public void testEquals() {
        assertNotEquals(a,b);
    }


}