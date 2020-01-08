import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1,2,"Double",50.00);
        bedroom2 = new Bedroom(2,1,"Single",45.68);
        conferenceRoom1 = new ConferenceRoom(6,"Chocolate");
        guest1 = new Guest("Aresky");
        guest2 = new Guest("Sophia");
        guest3 = new Guest("Nelson");

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

    @Test
    public void hotelCanCheckInGuest(){
        hotel.addBedroom(bedroom1);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.checkInGuestBedroom(guest1,bedroom1);
        hotel.checkInGuestBedroom(guest2,bedroom1);
        hotel.checkInGuestConferenceRoom(guest3,conferenceRoom1);

        assertEquals(2, bedroom1.guestsCount());
        assertEquals(1, conferenceRoom1.guestsCount());
        assertEquals(1,hotel.bedroomCount());
        assertEquals(1,hotel.conferenceRoomCount());
    }


    @Test
    public void hotelCanCheckoutGuests(){
        hotel.addBedroom(bedroom1);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.checkInGuestBedroom(guest1,bedroom1);
        hotel.checkInGuestBedroom(guest1,bedroom1);
        hotel.checkInGuestConferenceRoom(guest2,conferenceRoom1);

        hotel.checkOutGuestBedroom(bedroom1);
        hotel.checkOutGuestConferenceRoom(conferenceRoom1);

        assertEquals(1,bedroom1.guestsCount());
        assertEquals(0,conferenceRoom1.guestsCount());

    }

    @Test
    public void returnsBookingWhenBook(){
        Booking booking = hotel.bookRoom(bedroom1,3);
        assertEquals(3,booking.getNights());
        assertEquals(150,booking.totalBill(),0.01);
    }

    @Test
    public void returnCollectionOfOnlyVacantBedrooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        ArrayList<Bedroom> vacantRooms = hotel.getVacantBedrooms();
        assertEquals(1,vacantRooms.size());

    }

}
