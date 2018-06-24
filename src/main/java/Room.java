import java.lang.reflect.Array;
import java.util.ArrayList;

abstract class Room {

// we dont need to test class Room because its an abstract class and the methods get tested in the other
// test classes, i.e. bedroom and confroom

    private Integer capacity;

    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests =  new ArrayList<Guest>();
    }


    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest){
        if (guests.size() < this.capacity){
            guests.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
    }

    public int countGuest(){
            return guests.size();
        }
}





