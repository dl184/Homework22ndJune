import java.util.ArrayList;

public class Confroom extends Room {

    private String name;
    private Integer capacity;
    private ArrayList guests;
    private Integer dailyrate;

    public Confroom(String name, int capacity, int dailyrate) {
        super(capacity);
        this.guests = new ArrayList<Guest>();
        this.dailyrate = dailyrate;
        this.name = name;
    }

    public Integer getDailyRate() {
        return dailyrate;
    }

    public String getName() {
        return name;

    }
}

