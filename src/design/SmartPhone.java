package design;

public class SmartPhone extends PC{
    public SmartPhone(){
    }

    public SmartPhone(String manufacturer, int memorySize, int inventoryNum) {
        super(manufacturer, memorySize, inventoryNum);
    }
    public void makeACall() {
        System.out.println("Making a phone call...");
    }
    public void dialIntoConference() {
        System.out.println("Attending a conference...");
    }

}
