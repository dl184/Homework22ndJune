import java.util.ArrayList;

public class Bedroom extends Room {
    //    we dont need to pass in the array list to the constructor because we create a new empty list of guests
    //    this is blank because we would never create a room with guests already in it

    private Integer capacity;
    private TypesOfBedrooms type;
    private Integer number;
    private Integer nightlyrate;
    private ArrayList<Guest> guests;

//    above where we create TypesOfBedrooms which is an Enum which needs the class first which we created as an enum
//    "TypesOfBedroom" then the name we are calling it after that "types"
//
//
//   then below we declare the variable type and in the constructor we say this.type = type which means its an
//   atter first then the name we call it

//

    public Bedroom(int number, int capacity , TypesOfBedrooms type, int nightlyrate) {
        super(capacity);
        this.number = number;
        this.type = type;
        this.nightlyrate = nightlyrate;
        this.guests = new ArrayList<Guest>();
    }

    public TypesOfBedrooms getType() {
        return type;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getNightlyRate() {
        return nightlyrate;
    }
}
