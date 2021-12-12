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

        //Print attributes and methods of class TouristTicket

        TouristTicket touristTicket = new TouristTicket("Hotel Maurya",new String[5],23,6346,6750.99f,"Bangalore","pune",flight,new Passenger(2345,"kadma","jamshedpur","jharkhand","vaibhav","8324567789","vaibhavkumarjha46@gmail.com"),"10/12/2021","22:30","11/12/2021","04:30",false);
        // Adding locations
        touristTicket.addTouristLocation("shimla");
        touristTicket.addTouristLocation("Manali");
        touristTicket.addTouristLocation("Jamshedpur");
        touristTicket.addTouristLocation("Bangalore");
        touristTicket.addTouristLocation("Kashmir");

        // Removing location
        touristTicket.removeLocation("Bangalore");

        //Print attributes and methods of class RegularTicket
        RegularTicket regularTicket = new RegularTicket(23,6346,6750.99f,"Bangalore","Pune",flight,new Passenger(2345,"kadma","jamshedpur","jharkhand","vaibhav","8324567789","vaibhavkumarjha46@gmail.com"),"10/12/2021","22:30","11/12/2021","04:30",false,true,true,true);
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
