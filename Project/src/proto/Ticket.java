package proto;

abstract class Ticket {
    private Passenger passenger;
    private Flight flight;
    private int pnrNo;
    private String departureLocation;
    private String destinationLocation;
    private String depDate;
    private String depTime;
    private String arrivalDate;
    private String arrivalTime;
    private int seatNo;
    private float price = 0.0f;
    private boolean isCancelled;

    public Ticket(int seatNo,int pnrNo,float price,String departureLocation,String destinationLocation,Flight flight,Passenger passenger,
                  String depDate,String depTime,String arrivalDate,String arrivalTime,boolean isCancelled){
        this.seatNo = seatNo;
        this.pnrNo = pnrNo;
        this.price = price;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flight = flight;
        this.passenger = passenger;
        this.depDate = depDate;
        this.depTime = depTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.isCancelled = isCancelled;
    }

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
    }

    public int getPnrNo() {

        return pnrNo;
    }

    public void setPnr(int pnrNo) {

        this.pnrNo = pnrNo;
    }

    public String getDepartureLocation() {

        return departureLocation;
    }

    public void setFrom(String from) {

        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {

        return destinationLocation;
    }

    public void setDestinationLocation(String to) {

        this.destinationLocation = destinationLocation;
    }

    public String getDepartureDate() {

        return depDate;
    }

    public void setDepartureDate(String depDate) {

        this.depDate = depDate;
    }

    public String getDepartureTime() {

        return depTime;
    }

    public void setDepartureTime(String depTime) {

        this.depTime = depTime;
    }

    public String getArrivalDate() {

        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {

        this.arrivalDate = arrivalDate;
    }
    public String getArrivalTime() {

        return arrivalTime ;
    }

    public void setArrivalTime(String arrivalTime) {

        this.arrivalTime = arrivalTime;
    }


    public int getSeatNo() {

        return seatNo;
    }

    public void setSeatNo(int seatNo ){

        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {

        return isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    public Flight getFlight() {

        return flight;
    }

    public void setFlight(Flight flight) {

        this.flight = flight;
    }

    public Passenger getPassenger() {

        return passenger;
    }

    public void setPassenger(Passenger passenger) {

        this.passenger = passenger;
    }
}
