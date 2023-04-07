import lesson4.Animal;
import lesson4.Cat;
import lesson4.Dog;
import lesson4.Zoo;
import org.junit.*;

import static lesson4.Zoo.getAnimalFood;

public class TestCat {
    @Test
    public void firstTest() {
        Animal animal= new Animal(true," milc ",4);
        getAnimalFood(animal);
        Cat cat = new Cat(true, " viscas ", 5);
        getAnimalFood(cat);
 //       Animal dog = new Dog(false, "pedegri", 5);
 //       getAnimalFood(dog);

    }

}
