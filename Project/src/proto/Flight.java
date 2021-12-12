package proto;

public class Flight {
    private int flightNumber;
    private String airline;
    private int capacity;
    private int seatBooked;
    private boolean bookingStatus;

    public Flight(int flightNumber, String airline, int capacity, int seatBooked, boolean bookingStatus) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.seatBooked = seatBooked;
        this.bookingStatus = bookingStatus;
    }

    public void checkAvaibility() {
        int avail = capacity - seatBooked;
        if (avail > 0) {
            System.out.println("Seat Available");
        } else {
            System.out.println("Seat Not Available");
        }

    }


    public int getFlightNumber() {

        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {

        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {

        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {

        this.seatBooked = seatBooked;
    }

    public void updateSeatBooked() {
        bookingStatus = true;
        seatBooked++;
    }
}
