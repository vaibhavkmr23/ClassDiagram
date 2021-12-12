package proto;

public class RegularTicket {
    boolean needFood;
    boolean needWater;
    boolean needSnacks;

//    public RegularTicket(boolean needFood, boolean needWater, boolean needSnacks){
//        this.needFood = needFood;
//        this.needWater = needWater;
//        this.needSnacks  = needSnacks;
//        this.update();
//    }

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

    public void update(boolean needFood, boolean needWater, boolean needSnacks) {
        this.needFood = needFood;
        this.needWater = needWater;
        this.needSnacks = needSnacks;
    }
}
