# Generics 

    package Generics;
    
    import java.util.ArrayList;
    import java.util.List;
    
    public class PriorToGenerics {
        public static void main(String[] args) {
            List items = new ArrayList();
            items.add(1);
            items.add(2);
            items.add(3);
            items.add("Arun"); //this is perfectly fine, but will give class cast exception at runtime
            items.add(4);
    
            printDouble(items);
        }
    
        /**
         * @param items the below code will give
         */
        private static void printDouble(List items) {
            /*Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
            at Generics.PriorToGenerics.lambda$printDouble$0(PriorToGenerics.java:19)
            at java.util.ArrayList.forEach(ArrayList.java:1249)
            at Generics.PriorToGenerics.printDouble(PriorToGenerics.java:19)
            at Generics.PriorToGenerics.main(PriorToGenerics.java:15)*/
            items.forEach(i -> System.out.println((Integer) i * 2));
        }
    }
