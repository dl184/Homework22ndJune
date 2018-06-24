import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(){
        this.rooms = new ArrayList<Room>();
    }


//    we free up a new array list above with type Room and name rooms, we then below pass in the Type and the name we
//    assign the variable which is room, we then use the .add function on the currently empty array list "rooms' and pass
//    in (room) which is the class and that inherits all the attributes in that class


    public void addRoom(Room room) {
         rooms.add(room);
    }

    public int roomCount() {
        return rooms.size();
    }

//   we are wanting to add a guest into a room so we have a room and a guest, we pass in Room type and name and
//   Guest type and name and use the method we created in the Room class to add a guest to the room.. we have room
//   which has been passed in then the method of .addGuest then we passed the guest in the final brackets
//



//    we can add a guest in to a room by passing in the Room type and room name "guest" then we use the room name
//    and .addGuest method called from the Room class then pass (guest) in the final brackets which inherits everything
//    from the room class

    public void checkInGuest(Room room, Guest guest) {
        room.addGuest(guest);
        }


        public void checkOutGuest(Room room, Guest guest) {
        room.removeGuest(guest);
    }
}
