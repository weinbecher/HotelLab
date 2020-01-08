import java.util.ArrayList;

public class Bedroom {
    private int number;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;

    public Bedroom(int number, int capacity, String roomType){
        this.number = number;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;
    }


    public int getRoomNumber() {
        return this.number;
    }


    public int getCapacity() {
        return this.capacity;
    }

    public int guestsCount() {
        return this.guests.size();
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(){
        this.guests.remove(0);
    }
}
