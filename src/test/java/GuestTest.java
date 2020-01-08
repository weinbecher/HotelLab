import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void before() {
        guest1 = new Guest("Aresky");
        guest2 = new Guest("Sophia");
        guest3 = new Guest("Nelson");
    }

    @Test
    public void guestHasName(){
        assertEquals("Aresky",guest1.getName());
    }
}
