package lesson4;

public class Animal  {
    private boolean vegeterian;
   public String eats;
    private int noOfLegs;

    public Animal(boolean vegeterian, String eats, int Legs) {
        this.vegeterian = vegeterian;
        this.eats = eats;
        this.noOfLegs = Legs;
    }
    public void printEats(){
        System.out.println(this.eats);
    }
    public boolean isVegeterian() {
        return vegeterian;
    }
    public void setVegeterian(boolean vegaterian) {
        this.vegeterian = vegaterian;
    }
    public String getEats() {
        return this.eats;
    }
    public void setEats(String eats) {
        this.eats = eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}



