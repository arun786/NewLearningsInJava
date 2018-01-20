package General;

/**
 * Overloading of static method, overloading is done at compile time
 */
public class OverloadingAStaticMethod {

    public static void abc(String name) {
        System.out.println("name is " + name);
    }

    public static void abc(String name, String message) {
        System.out.println(name + " : " + message);
    }

    public static void main(String[] args) {
        abc("arun");
        abc("arun", "Hello");
    }
}

