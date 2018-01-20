# General Questions in Java

## Overloading of Static Method.

This is also called as static binding, normally static binding is
done on final, static and private.

    package General;
    
    /**
     * Overloading of static method, overloading is done at compile time
     */
    public class OverloadingAStaticMethod {
    
        public static void abc(String name) {
            System.out.println("name is " + name);
        }
    
        public static void abc(String name, String message) {
            System.out.println(name + " : " + message);
        }
    
        public static void main(String[] args) {
            abc("arun");
            abc("arun", "Hello");
        }
    }
    
## Rules of Overloaded method.

    1. Method signature should be different.
        a. number of arguments.
        b. Type of argument.
    2. Return type or access modifier does not count 
    
# Overriding a static method.

    package General;
    
    /**
     * Overriding a static method is not possible, it becomes method hiding
     */
    public class OverridingAStaticMethod {
        public static void main(String[] args) {
            A1.m1("arun");
            B1.m1("adwiti");
    
            A1 a = new B1();
            a.m1("Arun"); //this will call A1
    
            B1 b = new B1();
            b.m1("Adwiti"); //this will call B1
        }
    }
    
    class A1 {
        static void m1(String name) {
            System.out.println("A1 " + name);
        }
    }
    
    class B1 extends A1 {
        static void m1(String name) {
            System.out.println("B1 " + name);
        }
    }


## Overriding rules 

    1. Method signature and return type should be same.
    2. Overriding method cannot throw higher exception
    3. Overriding method cannot have more restrictive access modifiers.
    
    package General;
    
    public class ConceptOfOverRiding {
        public static void main(String[] args) {
            AAA a = new AAA();
            a.xyz("arun", 12); //this will call the AAA class method
            a.abc(); //AAA method called
    
            AAA b = new BBB();
            b.xyz("Adwiti", 14); //this will call the subclass method
            b.abc(); //BBB method called
        }
    }
    
    class AAA {
    
        public int xyz(String name, int age) {
            System.out.println(name + " AAA " + age);
            return 0;
        }
    
        public AAA abc() {
            System.out.println("AAA method being called...");
            return new AAA();
        }
    }
    
    
    class BBB extends AAA {
        public int xyz(String name, int age) {
            System.out.println(name + " BBB " + age);
            return 0;
        }
    
        public BBB abc() {
            System.out.println("BBB method called...");
            return new BBB();
        }
    
    
    }
    
### Overriding Clone Method in Java. Covariant return type.

In the above example, we return the respective class object 
for the overridden and overriding methods.

