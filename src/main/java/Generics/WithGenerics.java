package Generics;

import java.util.ArrayList;
import java.util.List;

public class WithGenerics {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        //items.add("arun"); This will give compilation error

        printDouble(items);
    }

    private static void printDouble(List<Integer> items) {
        items.forEach(i -> System.out.println(i * 2));
    }


}
