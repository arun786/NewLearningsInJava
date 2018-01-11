package InnerClass;

/**
 * static variable and instance variable can be
 * accessed from method local inner class but if the method is
 * static we can access only static member of the outer class
 */
public class StaticMethodLocalInnerClass {

    private int x = 0;
    private static int y = 10;

    /**
     * Method local inner class, where method is instance member of outer class
     */
    public void m1() {
        final int z = 20; //if the local variable is not defined as final, we cannot access in the inner class
        class inner {
            public void m2() {
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
        }
        inner ob = new inner();
        ob.m2();
    }

    public static void m2() {

        class inner {
            public void m2() {
                //System.out.println(x); //It cannot be accessed.
                System.out.println(y); //we can access only static variable
            }
        }

        inner ob = new inner();
        ob.m2();
    }

    public static void main(String[] args) {
        StaticMethodLocalInnerClass ob = new StaticMethodLocalInnerClass();
        ob.m1();

        System.out.println("--------------");
        StaticMethodLocalInnerClass.m2();
    }
}
