package design;

public class Email {

    String employeeFullName;
    int mailBoxSize;
    String emailAddress;

    public Email(){
    }
    public Email(int mailBoxSize){
        this.mailBoxSize = mailBoxSize;
    }
    public String assignEmailAddress(String employeeFullName){
        emailAddress = employeeFullName.toLowerCase() + "@" + EmployeeInfo.COMPANY_NAME.toLowerCase() + ".com";
        System.out.println("Your email address is " + emailAddress);
        return emailAddress;
    }
    public void sendEmail(){
        System.out.println("Sending email...");
    }
}
