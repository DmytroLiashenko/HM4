package lesson7;

public class Main {
    public static void main(String[] args) {
        test(new Cat("Jorik"));
        familyDog(new Dog("Sharic"));
        predator(new Lion("Simba"));
        canines(new Wolf("Bolto"));
        bigDog(new BigDog("Rex"));


    }


    private static void bigDog(BigDog bigDog) {
        bigDog.greets();
        bigDog.greets((Dog) bigDog);
        bigDog.greets(bigDog);
    }

    private static void canines(Wolf wolf) {
        wolf.greets();
        wolf.hunting();
    }

    private static void predator(Lion lion) {
        lion.greets();
        lion.hunting();
    }

    private static void test(Cat cat) {
        cat.greets();
        cat.feed();
        cat.walk();
        cat.play();
    }

    private static void familyDog(Dog dog) {
        dog.feed();
        dog.play();
        dog.greets();
        dog.walk();
        dog.greets(dog);
    }
}
