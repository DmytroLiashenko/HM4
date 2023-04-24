package lesson7;

public class BigDog extends Dog {
//    public String getGretting() {
//        return gretting;
//    }

    public String gretting ="";

    public BigDog(String name) {
        super(name);
    }

    @Override
            void greets(){
        System.out.println("Dog " + this.getName() + " says: Woow");
    }
//    void greets() {
//        String gretting = "Dog " + this.getName() + " says: Woow";
//        System.out.println(gretting);
//        this.gretting=gretting;
//
//
//    }

    void greets(Dog another) {

        System.out.println("2Dog " + another.getName() + " says: Woooow");
    }

    void greets(BigDog another) {

        System.out.println("BigDog " + another.getName() + " says: Woooooow");
    }
}
