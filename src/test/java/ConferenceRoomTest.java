import org.junit.Before;

public class ConferenceRoomTest {
    private  ConferenceRoom conferenceRoom1;
    private  ConferenceRoom conferenceRoom2;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(6,"Chocolate");
        conferenceRoom2 = new ConferenceRoom(8,"Gingerbread");
    }
}
