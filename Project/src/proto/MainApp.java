package proto;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {


        // Print attributes and methods of class Address
        Address address = new Address("kadma","jamshedpur","jharkhand");
        address.updateAddressDetails();

        //Print attributes and methods of class Contact
        Contact contact = new Contact("vaibhav","8345678999","vaibhavkumarjha46@gmail.com");
        contact.updateContact();

        //Print attributes and methods of class Flight
        Flight flight = new Flight(420,"vistara",300,200,true);
        System.out.println(flight.getAirline());
        System.out.println(flight.getFlightNumber());
        flight.checkAvaibility();
        flight.updateSeatBooked();


        //Print attributes and methods of class Tickets

        Ticket ticket = new Ticket(23,6346,6750.99f,"Bangalore","Pune",flight,
                new Passenger(2345,"kadma","jamshedpur","jharkhand","vaibhav","8324567789","vaibhavkumarjha46@gmail.com"),"10/12/2021","22:30","11/12/2021","4:00",false);
        System.out.println("Pnr No: " +ticket.getPnrNo());
        System.out.println("Departure Location: " +ticket.getDepartureLocation());
        System.out.println("Destination Location: "+ticket.getDestinationLocation());
        System.out.println("Departure Date: " +ticket.getDepartureDate());
        System.out.println("Departure Time: " +ticket.getDepartureTime());
        System.out.println("Arrival Date: "+ticket.getArrivalDate());
        System.out.println("Arrival Time: "+ticket.getArrivalDate());
        System.out.println("Seat No: "+ ticket.getSeatNo() );
        System.out.println("Price: " + ticket.getPrice());
       
        //Print attributes and methods of class TouristTicket

        TouristTicket touristTicket = new TouristTicket("Hotel Maurya",new String[5]);
        // Adding locations
        touristTicket.addTouristLocation("shimla");
        touristTicket.addTouristLocation("Manali");
        touristTicket.addTouristLocation("Jamshedpur");
        touristTicket.addTouristLocation("Bangalore");
        touristTicket.addTouristLocation("Kashmir");

        // Removing location
        touristTicket.removeLocation("Bangalore");

        //Print attributes and methods of class RegularTicket
        RegularTicket regularTicket = new RegularTicket(true,true,true);
        regularTicket.update();
        regularTicket.serviceAvailed();


        // Print attributes and methods of class Passenger
        Passenger passenger = new Passenger(2345,"kadma","jamshedpur","Jharkhand","vaibhav","8325678956","vaibhavkumarjha46@gmail.com");
        System.out.println("Passenger Id is:"+ passenger.getId());
        System.out.println("Passenger Address is:"+passenger.getAddress());
        System.out.println("Passenger Contact is:"+passenger.getContact());
        System.out.println("No of passengers: "+passenger.getPassengerCount());


    }
}
