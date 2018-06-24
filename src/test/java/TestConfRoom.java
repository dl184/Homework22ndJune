import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConfRoom {

    Confroom conferenceRoom1;
    Confroom conferenceRoom2;
    Guest guest1;
    Guest guest2;


    @Before
    public void setUp() throws Exception {
        conferenceRoom1 = new Confroom("Tokyo", 2, 100);
        conferenceRoom2 = new Confroom("Osaka", 1, 200);
        guest1 = new Guest("Derek");
        guest2 = new Guest("Paul");



    }


    @Test
    public void getRoomName() {
        assertEquals("Tokyo", conferenceRoom1.getName());
    }

    @Test
    public void getRoomCapacity() {
        assertEquals(1, conferenceRoom2.getCapacity());
    }

    @Test
    public void getRoomDailyrate() {
        assertEquals(100, (int) conferenceRoom1.getDailyRate());
    }

    @Test
    public void emptyGuestlist(){
        assertEquals(0, conferenceRoom1.countGuest());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.countGuest());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.removeGuest(guest1);
        assertEquals(0, conferenceRoom1.countGuest());
    }

    @Test
    public void CantAddMoreGuestsThanCapacity() {
        conferenceRoom2.addGuest(guest1);
        conferenceRoom2.addGuest(guest2);
        assertEquals(1, conferenceRoom2.countGuest());
        }

    @Test
    public void canGetGuestList() {
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest2);
        assertEquals("Derek", conferenceRoom1.getGuests());




    }
}
