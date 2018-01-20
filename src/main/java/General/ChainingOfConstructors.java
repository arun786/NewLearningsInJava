package General;

public class ChainingOfConstructors {

    public static void main(String[] args) {
        A a = new B();
    }

}


abstract class A {
    public A() {
        System.out.println("Abstract class");
    }
}

class B extends A {
    public B() {
        System.out.println("B called");
    }
}
