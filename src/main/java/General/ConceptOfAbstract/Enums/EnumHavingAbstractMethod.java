package General.ConceptOfAbstract.Enums;

public class EnumHavingAbstractMethod {

    public static void main(String[] args) {
        Seaonal.AUTUMN.printHours();
    }
}


enum Seaonal {

    WINTER {
        @Override
        public void printHours() {
            System.out.println("Winter ");
        }
    }, SPRING {
        @Override
        public void printHours() {
            System.out.println("Spring");
        }
    }, SUMMER {
        @Override
        public void printHours() {
            System.out.println("Summer");
        }
    }, AUTUMN {
        @Override
        public void printHours() {
            System.out.println("Autumn");
        }
    };

    public abstract void printHours();
}