package InnerClass;

public class NormalInnerClass {

    class Inner {
        /**
         * inner class method
         */
        public void m1() {
            System.out.println("Inner class method");
        }
    }

    /**
     * Call inner class method from m2.
     * <p>
     * Step 1 : create an instance of inner class.
     * Step 2 : use the object of inner class to call the method of m1()
     */
    public void m2() {
        System.out.println("Inside method m2 of outer class..");
        Inner ob = new Inner();
        ob.m1();
    }


    public static void main(String[] args) {
        /**
         * To call m1 from Outer class
         * Step 1 : create an object of Outer class
         * Step 2 : use the object of the outer class to create an object of Inner class
         */

        NormalInnerClass ob = new NormalInnerClass();
        NormalInnerClass.Inner innerOb = ob.new Inner();
        innerOb.m1();

        /**
         * Call the m2 method using the object of the outer class
         * which will automatically call the inner class method
         */
        ob.m2();
    }
}
