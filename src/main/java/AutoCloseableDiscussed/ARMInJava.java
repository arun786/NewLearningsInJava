package AutoCloseableDiscussed;

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

