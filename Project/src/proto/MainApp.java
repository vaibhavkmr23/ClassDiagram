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
        System.out.println("Flight No: " +flight.flightNumber);
        System.out.println("Airline is: " +flight.airline);
        flight.checkAvaibility();
        flight.updateSeatBooked();


        //Print attributes and methods of class Tickets
        Ticket ticket = new Ticket(23,234509,7499.99f,"bangalore","Pune",flight,"09/12/2021","22:15","10/12/2021","4:30");
        System.out.println("Pnr No: " +ticket.pnrNo);
        System.out.println("Departure Location: " +ticket.departureLocation);
        System.out.println("Destination Location: "+ticket.destinationLocation);
        System.out.println("Departure Date: " +ticket.depDate);
        System.out.println("Departure Time: " +ticket.depTime);
        System.out.println("Arrival Date: "+ticket.arrivalDate);
        System.out.println("Arrival Time: "+ticket.arrivalTime);
        System.out.println("Seat No: "+ ticket.SeatNo );
        System.out.println("Price: " + ticket.price);
        ticket.bookTicket();
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
        RegularTicket regularTicket = new RegularTicket();
        regularTicket.update(true,true,false);
        regularTicket.serviceAvailed();


        // Print attributes and methods of class Passenger
        Passenger passenger = new Passenger(2345);
        System.out.println("Passenger Id is:"+ passenger.id);
        System.out.println("Passenger Address is:"+passenger.getAddress());
        System.out.println("Passenger Contact is:"+passenger.getContact());


    }
}
