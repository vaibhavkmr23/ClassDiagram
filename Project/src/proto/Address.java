package proto;

public class Address {
    private String street;
    private String city;
    private String state;


    public void updateAddressDetails() {
        System.out.println(getAddress());
    }
    public String getAddress(){

        return  "street: "+street+ " city: "+city+" state: "+state;
    }
    public void setAddress(String street,String city,String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public Address(String street,String city,String state){
        this.street = street;
        this.city = city;
        this.state = state;

    }
}


