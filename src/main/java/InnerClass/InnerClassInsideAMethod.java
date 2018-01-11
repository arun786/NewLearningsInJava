package InnerClass;

public class InnerClassInsideAMethod {

    public void m1() {

        /**
         * Defining Inner class Inside method, which is also called Method local inner class
         */
        class inner {
            public void sum(int x, int y) {
                System.out.println("Sum is " + (x + y));
            }
        }

        inner ob = new inner();
        ob.sum(10, 20);
        ob.sum(15, 25);
        ob.sum(78, 34);
    }

    public static void main(String[] args) {
        InnerClassInsideAMethod ob = new InnerClassInsideAMethod();
        ob.m1();
    }
}
