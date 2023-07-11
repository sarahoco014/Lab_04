public class Computer {

    int storage;
    String printerModel;

    String message;

    public Computer(int storage, String printerModel) {
        this.storage = storage;
        this.printerModel = printerModel;
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
        System.out.println("Printing...");
        System.out.println("The printed message is: " + message);
    }
}


//Computer.getStorage();
//Computer.setStorage(5);