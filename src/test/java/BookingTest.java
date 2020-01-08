import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void before(){
        bedroom2 = new Bedroom(2,1,"Single");
        bedroom3 = new Bedroom(2,1,"Single");
        booking = new Booking(bedroom2, 3);
    }

    @Test
    public void bookingHasInitialValues(){
        assertEquals(bedroom2,booking.getBedroom());
        assertEquals(3,booking.getNights());
    }

}
