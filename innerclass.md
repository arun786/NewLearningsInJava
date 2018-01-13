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
    
    
## Normal or Regular Inner Class
    
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
    
#### Modifiers that can be applied to outer and inner class

Outer class                 Innerclass 

    > public                private 
    > default               protected 
    > final             +   static
    > abstract
    > strictfp

## Nested Class

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
    
    o/p will be 
    Nested Outer Class...
    Nested Inner class A...
    Nested Inner class B...

## Method local Inner class

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

Note : If we declare inner class inside instance method, then from that method local inner class we can access both static and non static members of outer class directly

Note : if we declare inner class inside method, then we can access only static members of outer class directly from that local inner class.


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

## Variables accessed directly from method local inner class

    package InnerClass;
    
    public class VariablesAccessedInsideMethodLocalInnerClass {
        private int instanceVariable = 10;
        private static int staticVarible = 12;
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

### method local inner class inside a static method

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
