package lesson4;

public class Zoo {
    public static void getAnimalFood(Animal some) {
        System.out.println(some.getEats());
        System.out.println(some.isVegeterian());

    }

    public static String getAnimalEats(Animal some) {
        return some.getEats();
    }
}
