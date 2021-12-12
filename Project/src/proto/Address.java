package proto;

public class Address {
    String street;
    String city;
    String state;


    public void updateAddressDetails() {
        System.out.println(getAddress());
    }
    public String getAddress(){

        return  "street: "+street+ " city: "+city+" state: "+state;
    }
    public Address(String street,String city,String state){
        this.street = street;
        this.city = city;
        this.state = state;

    }
}


