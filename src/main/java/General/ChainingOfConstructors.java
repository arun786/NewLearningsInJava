package General;

import java.util.Arrays;
import java.util.List;

public class ChainingOfConstructors {

    public static void main(String[] args) {
        A a = new B();

        List<Integer> lst = Arrays.asList(10,20,30);
        System.out.println(Arrays.toString(lst.toArray()));
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
