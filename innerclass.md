# Inner class
class defined inside another class are called inner class.

## Where do we use inner class
if a class is useful only for a particular class there we can use Inner class.
For Example, 
1. university has a department, here we can use department as inner class.
    
    public class University{
        class Department{
        }
    }
    
2. Car has an Engine
    
    public class Car{
        class Engine{
        }
    }

    Types of Inner Class
            
            * Normal or regular Inner class
            * Method Local Inner class
            * Anonymous Inner Class
            * Static Nested Class
    
    
   > Normal or Regular Inner Class
    
    public class Outer{
        class Inner{
        }
    }
    
    Any named class inside a class without static modifier.
    
    class files created are as 
    1. Outer.class
    2. Outer$Inner.class
    
    
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

#### Note : Static method or variable cannot be declared inside inner class
#### Note : Static method or variable can be accessed from an inner class
    
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
