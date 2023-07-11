public class Computer {

    int storage;
    String printerModel;

    String message;

    boolean isPrinterConnected;

    public Computer(int storage, String printerModel) {
        this.storage = storage;
        this.printerModel = printerModel;
        this.isPrinterConnected = true;
    }

    int getStorage() {
        return storage;
    }

    void addStorage(int newStorage) {
        this.storage += newStorage;
    }

    void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    String getPrinterModel() {
        return printerModel;
    }

    // put getters and setters together

    void printMessage(String message) {
        if(isPrinterConnected) {
            System.out.println("Printing message ...");
            System.out.println("The printing message is: " + message);
        }
    }
}


//Computer.getStorage();
//Computer.setStorage(5);