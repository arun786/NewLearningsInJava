package General.ConceptOfAbstract.Enums;

public class EnumConcepts {

    public static void main(String[] args) {

        for (Season season : Season.values()) {
            System.out.println(season.name() + ":" + season.ordinal());
            System.out.println(season.name() + ":" + season.ordinal());
            season.print();
        }
        SwitchInEnum(Season.AUTUMN);

    }

    public static void SwitchInEnum(Season seasonEnum) {

        switch (seasonEnum) {
            case WINTER:
                System.out.println("Winter");
                break;
            case FALL:
                System.out.println("FALL");
                break;
            case AUTUMN:
                System.out.println("Autumn");
                break;
            case SPRING:
                System.out.println("Spring");
                break;
        }
    }
}

enum Season {

    WINTER("Winter"), SPRING("Spring"), AUTUMN("Autumn"), FALL("Fall");

    private String season;

    Season(String season) {
        this.season = season;
        System.out.println("Constructor...");
    }

    public void print(){
        System.out.println(season);
    }
}
