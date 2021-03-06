import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;



    @Before
    public void before(){
        bedroom1 = new Bedroom(1,2,"Double",45.60);
        bedroom2 = new Bedroom(2,1,"Single",45.60);
        bedroom3 = new Bedroom(2,1,"Single",45.60);
        guest1 = new Guest("Aresky");
        guest2 = new Guest("Sophia");
        guest3 = new Guest("Nelson");
    }

    @Test
    public void bedroomInitalProverty(){
        assertEquals(1,bedroom1.getRoomNumber());
        assertEquals(2,bedroom1.getCapacity());
        assertEquals(0,bedroom1.guestsCount());
        assertEquals("Double",bedroom1.getRoomType());

    }

    @Test
    public void bedroomCanCheckInGuest(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(2,bedroom1.guestsCount());
    }





}
