public class Booking {
    private Bedroom bedroom;
    private int night;

    public Booking(Bedroom bedroom, int night){
        this.bedroom = bedroom;
        this.night = night;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNights() {
        return this.night;
    }

    public double totalBill() {
        return bedroom.getNightRate() * this.night;
    }
}
