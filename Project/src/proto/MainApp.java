package proto;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Ticket regularTicket = new Ticket(23,252627,7000.0f,"Bangalore","Pune",null,null,"10/12/2021","22:30","11/12/2021","04:30",false);
        Ticket touristTicket = new TouristTicket("Delhi",new String[]{},30,245697,6000.0f,"Delhi","Kolkata",null,null,"14/12/2021","07:00","14/12/2021","11:30",false);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }
    public static void printTicketDetails(Ticket ticket) {

        System.out.println(ticket.getPnrNo());
    }

}
