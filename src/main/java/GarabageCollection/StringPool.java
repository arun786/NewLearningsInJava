package GarabageCollection;

public class StringPool {
    public static void main(String[] args) {
        /**
         * These are string literals
         */
        String name = "sachin";
        String name1 = "sachin";

        if (name == name1) {
            System.out.println("sachin is the same object in the pool");
        } else {
            System.out.println("Sachin is different object in the pool");
        }

        /**
         * The below is not a String literal
         */
        String number = new Integer(4).toString();
        String number1 = "4";

        if (number == number1) {
            System.out.println("they are the same");
        } else {
            System.out.println("they are not the same");
        }


        String number2 = new Integer(5).toString().intern();
        String number3 = "5";

        if (number2 == number3) {
            System.out.println("they are the same");
        } else {
            System.out.println("they are not the same");
        }

    }
}
