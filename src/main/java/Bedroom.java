import java.util.ArrayList;

public class Bedroom {
    private int number;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;
    private double nightRate;

    public Bedroom(int number, int capacity, String roomType,double nightRate){
        this.number = number;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;
        this.nightRate = nightRate;
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

    public double getNightRate() {
        return this.nightRate;
    }
}
