import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

//    below you create a new type and name then that gives you access to the properties in the constructor
//    and we can use the methods of that defined class
//
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {

//        number, capacity, type, nightlyrate

        bedroom1 = new Bedroom(1, 1, TypesOfBedrooms.SINGLE, 75 );
        bedroom2 = new Bedroom(2, 2, TypesOfBedrooms.DOUBLE, 100);
        guest1 = new Guest("Derek");
        guest2 = new Guest("Paul");

        }

//    if you get the ambigious assertEquals it means you need to put (int) after the comma (like below) but i have no idea why

    @Test
    public void getNumber() {
        assertEquals(1, (int) bedroom1.getNumber());
    }

    @Test
    public void getCapacity() {
        assertEquals(2, bedroom2.getCapacity());
    }

    @Test
    public void getType() {
        assertEquals("Double", bedroom2.getType());
    }

    @Test
    public void getNightlyRate() {
        assertEquals(75, (int) bedroom1.getNightlyRate());
    }


//  below we use the .addGuest method on bedroom1 and pass in the guest we would like to add (guest1) then we expect 1
//  guest and check that by doing .countRoom on bedroom1

    @Test
    public void addGuestToRoom() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.countGuest());
    }

//  below we add a guest to a room then remove them again to check that the remove function works

    @Test
    public void canRemoveGuest() {
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.countGuest());
    }
}
