package ValueAndReferences;

public class HowObjectsArePassed {
    public static void main(String[] args) {
        /**
         * c is created on a stack and Customer object
         * is created on heap along with the string arun,
         * c will be referring to Customer object which is on heap
         * from stack.
         */
        Customer c = new Customer("arun");
        System.out.println(c.getName()); //this will give arun
        changeName(c);
        System.out.println(c.getName()); //this will give adwiti
    }

    /**
     * @param a new reference will be created as cust on the stack
     *          which will be pointing to the same Customer Object which is on heap
     */
    private static void changeName(Customer cust) {
        /**
         * this will change the name of the Customer Object from arun to adwiti.
         * arun will be gc.
         */
        cust.setName("adwiti");
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
