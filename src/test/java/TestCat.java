import lesson4.*;
import org.junit.*;

import static lesson4.Zoo.getAnimalEats;
import static lesson4.Zoo.getAnimalFood;
import static lesson7.BigDog.

public class TestCat {
    @Test
    public void firstTest() {
        Animal animal = new Animal(true, " milc ", 4);
        getAnimalFood(animal);

        Cat cat = new Cat(true, " viscas ", 5);
        getAnimalFood(cat);

        Animal dog = new Dog(false, "pedegri", 5);
        getAnimalFood(dog);
        System.out.println("==============");

        Animal oslic = new Oslic(true, "osliha ", 2, "blue");
        getAnimalFood(oslic);
    }

    @Test
    public void catEatsTest() {
        Cat cat = new Cat(true, " viscas ", 5);
        String catEats = getAnimalEats(cat);
        Assert.assertEquals("cat love  viscas ", catEats);

    }
    @Test
    public void gogEatsTest() {
        Dog dog = new Dog(true, " viscas ", 5);
        String dogEats = getAnimalEats(dog);
        Assert.assertEquals("dog love viscas ", dogEats);
    }
    @Test
    public void dogLegsTest(){
        Dog dog = new Dog(true," viscas ",5 );


    }

    @Test


}
