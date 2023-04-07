package lesson4;

public class Cat extends Animal{
    private String color;

    public Cat(boolean vegeterian, String eats, int Legs) {
        super(vegeterian, eats, Legs);
        this.color = "red";
    }

    public String getEats() {
        return "cat love " + super.eats;
    }

    public Cat(boolean vegeterian, String eats, int Legs, String color) {
        super(vegeterian, eats, Legs);
        this.color = color;
    }


}
