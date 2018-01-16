# Java 7 Features.

## AutoCloseable in Java

Also called Automatic Resource Management, where we use AutoCloseable
interface. This is also called as Try with Resource 

        public class ARMInJava {
        
            public static void main(String[] args) throws Exception {
                try (Resource resource = new Resource()) {
                    resource.function1();
                    resource.function2();
                }
            }
        }
        
        class Resource implements AutoCloseable {
        
            public Resource() {
                System.out.println("Resource Allocated");
            }
        
            public void function1() {
                System.out.println("Function 1 Called");
            }
        
            public void function2() {
                System.out.println("Function 2 called");
            }
        
            public void close() throws Exception {
                System.out.println("Closed called");
            }
        }
        
        /*o/p will be
        Resource Allocated
        Function 1 Called
        Function 2 called
        Closed called*/
### ---------------------------------------

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        
        public class TryWithResourceExample {
        
            /**
             * @param args Take an input from a user and store it in a string
             */
        
        
            public static void main(String[] args) throws IOException {
        
                System.out.println("Please input ");
                ReadInputFromUserPriorJava7();
                ReadInputFromUserInJava7();
            }
        
            public static void ReadInputFromUserPriorJava7() {
                BufferedReader br = null;
                String str = "";
                try {
                    br = new BufferedReader(new InputStreamReader(System.in));
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        br.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                System.out.println(str);
            }
        
            /**
             * @throws IOException This is also called as Try with Resource
             */
            public static void ReadInputFromUserInJava7() throws IOException {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                    String str = br.readLine();
                    System.out.println(str);
                }
            }
        }
    
## Switch Statement in java 7.

Before Java 7, only enum and primitives were used in Switch cases, from Java 
7 we can use Strings as Switch Statement.

    private static void getTradeStatus(String trade) {
        switch (trade) {
            case "success":
                System.out.println("Success");
                break;
            case "pending":
                System.out.println("Pending");
                break;
            case "execute":
                System.out.println("Execute");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
