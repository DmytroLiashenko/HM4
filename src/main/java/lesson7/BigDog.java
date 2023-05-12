package lesson7;

public class BigDog extends Dog {
    public String getGretting() {
        return gretting;
    }

    public String gretting ="";

    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        String gretting = "Dog " + this.getName() + " says: Woow";
        System.out.println(gretting);
        this.gretting=gretting;


    }

    void greets(Dog another) {
        String gretting = "2Dog " + another.getName() + " says: Woooow";
        System.out.println(gretting);
        this.gretting=gretting;
    }

    void greets(BigDog another) {
        String gretting = "BigDog " + another.getName() + " says: Woooooow";
        System.out.println(gretting);
        this.gretting=gretting;

    }
}
