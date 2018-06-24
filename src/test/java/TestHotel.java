import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Confroom conferenceRoom1;
    Guest guest1;

//    Bedroom bedroom1;
//    Bedroom bedroom2;
//    Confroom conferenceRoom2;


// in our constructor below we are basically setting up our test, we pass in 4 rooms in total

    @Before
    public void setUp() throws Exception {
          hotel = new Hotel();
          conferenceRoom1 = new Confroom("Tokyo", 2, 100);
          guest1 = new Guest("Derek");

//        conferenceRoom2 = new Confroom("Osaka", 1, 200);
//        bedroom1 = new Bedroom(1, 1, TypesOfBedrooms.SINGLE, 75 );
//        bedroom2 = new Bedroom(2, 2, TypesOfBedrooms.DOUBLE, 100);
//        hotel.addRoom(conferenceRoom1);
//        hotel.addRoom(conferenceRoom2);
//        hotel.addRoom(bedroom1);
//        hotel.addRoom(bedroom2);
        }

    @Test
    public void GetRoomCount() {
        assertEquals(0, hotel.roomCount());
    }

    @Test
    public void addRoom() {
        hotel.addRoom(conferenceRoom1);
        assertEquals(1, hotel.roomCount() );
    }

    @Test
    public void canCheckInGuest() {
       hotel.checkInGuest(conferenceRoom1, guest1);
       assertEquals(1, conferenceRoom1.countGuest());
    }

    @Test
    public void canRemoveGuest() {
        hotel.checkInGuest(conferenceRoom1, guest1);
        hotel.checkOutGuest(conferenceRoom1, guest1);
        assertEquals(0, conferenceRoom1.countGuest());
    }
}
