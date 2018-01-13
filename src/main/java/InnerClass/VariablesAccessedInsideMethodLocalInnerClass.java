package InnerClass;

public class VariablesAccessedInsideMethodLocalInnerClass {
    private int instanceVariable = 10;
    private static int staticVariable = 12;
    private static final int staticFinalVariable = 14;

    /**
     * Non static Method having inner class also called method local inner class
     */
    private void m1() {

        /**
         * local variable cannot be accessed from inner class if
         * they are not final or effectively final
         */
        int localVariable = 12;
        final int finalLocalVariable = 18;

        class inner {
            private void m2() {
                System.out.println("We cannot access local variable if it is not initialized.." + localVariable);
                System.out.println("instance variable can be accessed " + instanceVariable);
                System.out.println("static variable can be accessed " + staticVariable);
                System.out.println("static final variable can be accessed " + staticFinalVariable);
                System.out.println("final local variable can be accessed " + finalLocalVariable);
            }
        }
        inner i = new inner();
        i.m2();
    }

    public static void main(String[] args) {
        VariablesAccessedInsideMethodLocalInnerClass ob = new VariablesAccessedInsideMethodLocalInnerClass();
        ob.m1();
    }
}
