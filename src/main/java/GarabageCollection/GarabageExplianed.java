package GarabageCollection;

public class GarabageExplianed {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long availableBytes = runtime.freeMemory();
        System.out.println("Available Bytes " + availableBytes / 1024);

        for (int i = 0; i < 1000000; i++) {
            Customer c = new Customer("john");
        }

        availableBytes = runtime.freeMemory();
        System.out.println("Available Bytes " + availableBytes / 1024);

        System.gc();
        availableBytes = runtime.freeMemory();
        System.out.println("Available Bytes " + availableBytes/1024 );
    }

}

class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public void finalize(){
        System.out.println("Finalized called...");
    }
}
