package proto;

public class RegularTicket extends Ticket {
    private boolean needFood;
    private boolean needWater;
    private boolean needSnacks;

    public RegularTicket(int seatNo,int pnrNo,float price,String departureLocation,String destinationLocation,Flight flight,Passenger passenger,
                         String depDate,String depTime,String arrivalDate,String arrivalTime,boolean isCancelled,boolean needFood,boolean needWater,boolean needSnacks){
        super(seatNo,pnrNo,price,departureLocation,destinationLocation,flight,passenger,depDate,depTime,arrivalDate,arrivalTime,isCancelled);
        this.needSnacks = needSnacks;
        this.needWater = needWater;
        this.needFood = needFood;
    }
    public boolean getNeedFood(){
        return needFood;
    }
    public void setNeedFood(boolean needFood){
        this.needFood = needFood;
    }

    public boolean getNeedWater(){
        return needWater;
    }
    public void setNeedWater(boolean needWater){
        this.needWater = needWater;
    }
    public boolean getNeedSnacks(){
        return needSnacks;
    }
    public void setNeedSnacks(boolean needSnacks){
        this.needFood = needSnacks;
    }

    public void serviceAvailed() {
        if (needFood == true) {
            System.out.println("Food Taken");
        }
        else {
            System.out.println("Food Not Taken");
        }
        if (needWater == true) {
            System.out.println("Water Taken");
        }
        else {
            System.out.println("Water Not Taken");
        }
        if (needSnacks == true) {
            System.out.println("Snacks Taken");
        }
        else {
            System.out.println("Snacks Not Taken");
        }

    }

    public void update() {
        needFood = true;
        needWater = true;
        needSnacks = true;
    }
}

