public class Computer {

    private int storage;
    private String printerModel;

    private String message;

    private boolean isPrinterConnected;

    public Computer(int storage, String printerModel) {
        this.storage = storage;
        this.printerModel = printerModel;
        this.isPrinterConnected = true;
    }

    public int getStorage() {
        return storage;
    }

    public void addStorage(int newStorage) {
        this.storage += newStorage;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    // put getters and setters together

    public void printMessage(String message) {
        if(isPrinterConnected) {
            System.out.println("Printing message ...");
            System.out.println("The printing message is: " + message);
        }
    }
}


//Computer.getStorage();
//Computer.setStorage(5);