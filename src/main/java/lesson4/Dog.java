package lesson4;

public class Dog extends Animal{
    private String color;

    public Dog(boolean vegeterian, String eats, int Legs) {
        super(vegeterian, eats, Legs);
        this.color = "brawn";
    }

    @Override
    public String getEats() {
        return "dog love" + super.eats;
    }
    @Override

    public boolean isVegeterian(){
        System.out.println("переопределено");
     return super.isVegeterian();
    }
    public Dog(boolean vegeterian, String eats, int Legs, String color) {
        super(vegeterian, eats, Legs);
        this.color = color;
    }


}
