# Value and References.

When a primitive type is passed into a method, a copy of the variable is created.

    public class HowPrimitivesArePasseds {
        public static void main(String[] args) {
            int localVariable = 10;
            Calculate(localVariable);
            System.out.println(localVariable);
        }
    
        private static void Calculate(int copyOflocalVariable) {
            copyOflocalVariable = copyOflocalVariable * 100;
        }
    }
    
    step 1 : localvariable is first put in stack
    step 2 : copyOflocalVariable is then put in the stack
    step 3 : mutliplication with 100 is then done and copyOflocalVariable is updated.
    step 4 : then copyOflocalVariable is removed from the stack
    step 5 : then local variable is removed, so there are no connection between the two variables.
    
    Therefore the output of the program will be 10 and 1000. 
    
## How objects are passed in Java.

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
