import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);

    }

    public void checkInGuestBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkInGuestConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestBedroom(Bedroom bedroom) {
        bedroom.removeGuest();
    }

    public void checkOutGuestConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest();
    }


    public Booking bookRoom(Bedroom bedroom, int i) {
        return new Booking(bedroom,i);
    }

    public ArrayList<Bedroom> getVacantBedrooms() {
         ArrayList<Bedroom> result = new ArrayList<Bedroom>();
        for(Bedroom bedroom : this.bedrooms){
            if (bedroom.guestsCount() == 0){
                result.add(bedroom);
            }
        }
        return result;
    }
}
