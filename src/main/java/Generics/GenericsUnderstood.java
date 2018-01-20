package Generics;

public class GenericsUnderstood {

    public static void main(String[] args) {
        Gen<String> gen = new Gen<>("arun");
        gen.show();
        System.out.println(gen.getValue());
        Gen<Integer> in = new Gen<>(10);
        in.show();
        System.out.println(in.getValue());
    }
}

class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public void show() {
        System.out.println(ob.getClass().getName());
    }


    public T getValue() {
        return ob;
    }
}
