package lesson9;
//SMALL, MEDIUM, LARGE и EXTRA_LARGE.
public class Clothes {

    public static void getClothes (Size size){
        switch (size){
            case SMALL -> {System.out.println("S");}
            case MEDIUM -> System.out.println("M");
            case LARGE -> System.out.println("L");
            case EXTRA_LARGE -> System.out.println("XL");
            default -> System.out.println("Sorry you are very fat");
        }
    }
}
