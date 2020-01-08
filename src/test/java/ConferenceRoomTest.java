import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private  ConferenceRoom conferenceRoom1;
    private  ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(6,"Chocolate");
        conferenceRoom2 = new ConferenceRoom(8,"Gingerbread");
        guest1 = new Guest("Aresky");
        guest2 = new Guest("Sophia");
        guest3 = new Guest("Nelson");
    }

    @Test
    public void conferenceHasInitialValues(){
        assertEquals("Chocolate",conferenceRoom1.getName());
        assertEquals(6,conferenceRoom1.getCapacity());
        assertEquals(0,conferenceRoom1.guestsCount());
    }

    @Test
    public void bedroomCanCheckInGuest(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest2);
        assertEquals(2,conferenceRoom1.guestsCount());

    }

}
