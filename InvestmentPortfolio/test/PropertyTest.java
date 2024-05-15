import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PropertyTest {
    Property g;

    @Before
    public void setUp(){
        g = new Property("Pip","13 Woods", 100000);
    }

    @Test
    public void testGetters() {
        assertEquals("Pip", g.getOwnerName());
        assertEquals("13 Woods", g.getAddress());
        assertEquals(100000, g.getPropertyValue());
    }

    @Test
    public void testSetters() {
        g.setOwnerName("Charles");
        assertEquals("Charles", g.getOwnerName());
        g.setAddress("12 Woods");
        assertEquals("12 Woods", g.getAddress());
        g.setPropertyValue(110000);
        assertEquals(110000, g.getPropertyValue());
    }

}