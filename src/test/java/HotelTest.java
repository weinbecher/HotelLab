import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;


    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1,2,"Double");
        bedroom2 = new Bedroom(2,1,"Single");
        conferenceRoom1 = new ConferenceRoom(6,"Chocolate");

    }

    @Test
    public void hotelRoomValues(){
        assertEquals(0,hotel.bedroomCount());
        assertEquals(0,hotel.conferenceRoomCount());
    }

    @Test
    public void hotelCanCheckInRoom(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(2,hotel.bedroomCount());
        assertEquals(1,hotel.conferenceRoomCount());
    }

}
