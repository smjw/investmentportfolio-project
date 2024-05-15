import org.junit.Test;

public class ShareholdingTest {

    Shareholding b = new Shareholding("bb", new Money(50), 10);

    @Test
    public void test1() {
        b.changeShareprice(new Money(10));
    }

    @Test
    public void test2(){
        b.changeNumHeld(12);
    }

    @Test
    public void test3() {
        b.getValue();
    }
}