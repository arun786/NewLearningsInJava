package InnerClass;

/**
 * Method Local Inner class when declared inside a static method
 */
public class VariablesAccessedInsideStaticMethodLocalInnerClass {

    private int instanceVariable = 10; //Cannot be accessed via a static method
    private static int staticVariable = 12;
    private static final int staticFinalVariable = 14;

    /**
     * Inner class defined inside a static method
     */
    public static void m1() {

        int localVariable = 10;
        final int localFinalVariable = 12;
        class inner {
            public void m2() {
                System.out.println("We cannot access instance variable " + localVariable);
                //System.out.println("Instance variable cannot be accessed "+instanceVariable);
                System.out.println("static final variable can be accessed " + staticFinalVariable);
                System.out.println("static variable can be accessed " + staticVariable);
                System.out.println("local final variable can be accessed " + localFinalVariable);
            }
        }

        inner i = new inner();
        i.m2();
    }

    public static void main(String[] args) {
        VariablesAccessedInsideStaticMethodLocalInnerClass.m1();
    }

}
