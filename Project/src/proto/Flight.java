package proto;

public class Flight {
    int flightNumber;
    String airline;
    int capacity;
    int seatBooked;
    boolean bookingStatus;

    public void checkAvaibility() {
        int avail = capacity - seatBooked;
        if (avail > 0) {
            System.out.println("Seat Available");
        } else {
            System.out.println("Seat Not Available");
        }

    }

    public void updateSeatBooked() {
        if (bookingStatus == true)
            System.out.println("flight booked");
        else {
            System.out.println("flight not booked");
        }
    }

    public Flight(int flightNumber, String airline, int capacity, int seatBooked, boolean bookingStatus) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.seatBooked = seatBooked;
        this.bookingStatus = bookingStatus;
    }

}
