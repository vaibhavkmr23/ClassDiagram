package proto;

public class Contact {
    private String name;
    private String phoneNo;
    private String emailId;

    public  String getContact(){
        return "name: "+name+ " phoneNo: "+phoneNo+" emailId :"+emailId;

    }
    public void setContact(String name,String phoneNo,String emailId){
        this.name = name;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
    }
    public void updateContact(){

        System.out.println(getContact());
    }
    public Contact(String name,String phoneNo,String emailId){
        this.name = name;
        this.phoneNo = phoneNo;
        this.emailId = emailId;

    }

}
