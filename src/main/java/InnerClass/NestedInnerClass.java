package InnerClass;

public class NestedInnerClass {

    public static void main(String[] args) {
        Outer ob = new Outer();
        Outer.A b = ob.new A();
        Outer.A.B c = b.new B();

        ob.m1();
        b.m2();
        c.m3();
    }

}

class Outer {
    class A {
        class B {
            public void m3() {
                System.out.println("Nested Inner class B...");
            }
        }

        public void m2() {
            System.out.println("Nested Inner class A...");
        }
    }

    public void m1() {
        System.out.println("Nested Outer Class...");
    }
}
