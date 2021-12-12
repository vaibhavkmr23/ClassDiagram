package proto;

public class Contact {
    String name;
    String phoneNo;
    String emailId;

    public  String getContact(){
        return "name: "+name+ " phoneNo: "+phoneNo+" emailId :"+emailId;

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

