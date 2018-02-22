package General.ConceptOfAbstract;

public class ConceptOfAbstract {

    public static void main(String[] args) {
        Color ob = new Red("red");
        System.out.println(ob.getColor());
        ob.print();
    }
}

abstract class Color {
    String color = "default";
    String name = "arun";

    protected void print() {
        System.out.println(name);
    }

    abstract String getColor();
}

class Red extends Color {
    String name = "adwiti";

    public Red(String color) {
        this.color = color;
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    protected void print() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang.builder.ToStringBuilder(this)
                .toString();
    }


}
