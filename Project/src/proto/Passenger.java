package proto;

public class Passenger {
    private int id;
    private proto.Passenger.Address address;
    private proto.Passenger.Contact contact;
    private static int idCounter = 0;

    private static class Address {
        String street, city, state;

        Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact {
        String name, phone, email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    public Passenger(int id,String street, String city, String state, String name, String phone, String email){
        this.id = idCounter++;
        this.address = new proto.Passenger.Address(street, city, state);
        this.contact = new proto.Passenger.Contact(name, phone, email);
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getAddress() {
        return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;

    }
    public String getContact(){

        return "Name: " + contact.name + ", Phone: " + contact.phone + ", Email: " + contact.email;
    }
    public static int getPassengerCount() {

        return idCounter;
    }
}

