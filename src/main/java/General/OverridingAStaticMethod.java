package General;

/**
 * Overriding a st
 */
public class OverridingAStaticMethod {
    public static void main(String[] args) {
        A1.m1("arun");
        B1.m1("adwiti");

        A1 a = new B1();
        a.m1("Arun"); //this will call A1

        B1 b = new B1();
        b.m1("Adwiti"); //this will call B1
    }
}

class A1 {
    static void m1(String name) {
        System.out.println("A1 " + name);
    }
}

class B1 extends A1 {
    static void m1(String name) {
        System.out.println("B1 " + name);
    }
}
