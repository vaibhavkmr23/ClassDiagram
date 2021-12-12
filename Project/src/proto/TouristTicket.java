package proto;

import java.util.Arrays;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String touristLocation[];
    public TouristTicket(String hotelAddress,String[] touristLocation,int seatNo,int pnrNo,float price,String departureLocation,String destinationLocation,Flight flight,Passenger passenger,
                         String depDate,String depTime,String arrivalDate,String arrivalTime,boolean isCancelled){
        super(seatNo,pnrNo,price,departureLocation,destinationLocation,flight,passenger,depDate,depTime,arrivalDate,arrivalTime,isCancelled);
        this.hotelAddress = hotelAddress;
        this.touristLocation = touristLocation;
    }

    public String getHotelAddress(){
        return hotelAddress;
    }
    public void setHotelAddress(String hotelAddress){
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] touristLocation){
        this.touristLocation = touristLocation;
    }

    public void addTouristLocation(String location) {
        int position = -1;
        for (int i = 0; i < touristLocation.length; i++) {
            if (touristLocation[i] == null) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            touristLocation[position] = location;
        }
        System.out.println(Arrays.toString(touristLocation));
    }


    public void removeLocation(String location){
        int position = -1;
        for(int i=0;i<touristLocation.length;i++ ){
            if (touristLocation[i].equals(location)){
                position = i;
                break;
            }
        }
        if(position ==-1){
            return;
        }
        for (int i=position;i<touristLocation.length-1;i++){
            touristLocation[i] = touristLocation[i+1];
        }
        touristLocation[touristLocation.length-1] = null;
        System.out.println(Arrays.toString(touristLocation));
    }
}
