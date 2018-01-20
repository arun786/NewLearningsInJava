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