package design;

public class PC {

    private String manufacturer;
    private int memorySize;
    private boolean hasSmartCard;
    private int inventoryNum;
    Email email;

    public PC(String manufacturer, int memorySize, boolean hasSmartCard, int inventoryNum, Email email) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
        this.hasSmartCard = hasSmartCard;
        this.inventoryNum = inventoryNum;
        this.email = email;
    }

    public PC(){
    }

    public PC(String manufacturer, int memorySize, int inventoryNum) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
        this.inventoryNum = inventoryNum;
    }

    public Email getEmail() {
        return email;
    }
    public void createReport() {
        System.out.println("Creating a report...");
    }
    public void submitTimeSheet() {
        System.out.println("Submitting a Time Sheet...");
    }


}
