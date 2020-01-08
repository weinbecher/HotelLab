import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private  ConferenceRoom conferenceRoom1;
    private  ConferenceRoom conferenceRoom2;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(6,"Chocolate");
        conferenceRoom2 = new ConferenceRoom(8,"Gingerbread");
    }

    @Test
    public void conferenceHasInitialValues(){
        assertEquals("Chocolate",conferenceRoom1.getName());
        assertEquals(6,conferenceRoom1.getCapacity());
        assertEquals(0,conferenceRoom1.guestsCount());
    }
}
