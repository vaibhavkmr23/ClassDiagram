package proto;

public class Ticket {
    Passenger passenger;
    Flight flight;
    int pnrNo;
    String departureLocation;
    String destinationLocation;
    String depDate;
    String depTime;
    String arrivalDate;
    String arrivalTime;
    int SeatNo;
    float price = 0.0f;
    boolean isCancelled;

    public Flight bookTicket(){
        return flight;

    }

    public  void bookingStatus(boolean isCancelled){
        if (isCancelled == true){
            System.out.println("Cancelled");
        }
        else{
            System.out.println("confirmed");
        }
    } public Ticket(int seatNo,int pnrNo,float price,String departureLocation  ,String destinationLocation,Flight flight,String depDate,String depTime,String arrivalDate,String arrivalTime){
        this.pnrNo = pnrNo;
        this.SeatNo = 23;
        this.price = price;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flight = flight;
        this.depDate = depDate;
        this.depTime = depTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
    }


}
