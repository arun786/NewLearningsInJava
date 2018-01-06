package InnerClass;

public class AccessingStaticInInnerClass {

    private static int x = 10; // x is a class variable
    private int y = 100; // y is an instance variable of Outer class

    class Inner {
        //static int z = 100; //we cannot define a static variable or method inside an normal inner class
        int y = 10;

        public void m1() {
            System.out.println(x); // static variable of outer class can be accessed in the inner class
            System.out.println(this.y); //this will print the value of y of inner class
            System.out.println(AccessingStaticInInnerClass.this.y);//This will print the value of outer class
        }
    }

    public static void main(String[] args) {
        AccessingStaticInInnerClass outer = new AccessingStaticInInnerClass();
        AccessingStaticInInnerClass.Inner ob = outer.new Inner();
        ob.m1();
    }
}
