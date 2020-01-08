import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void before(){
        bedroom2 = new Bedroom(2,1,"Single",45.68);
        bedroom3 = new Bedroom(2,1,"Single",45.68);
        booking = new Booking(bedroom2, 3);
    }

    @Test
    public void bookingHasInitialValues(){
        assertEquals(bedroom2,booking.getBedroom());
        assertEquals(3,booking.getNights());
    }

    @Test
    public void bookingTotalBill(){
        booking = new Booking(bedroom2, 3);
        assertEquals(137.04,booking.totalBill());
    }
}
