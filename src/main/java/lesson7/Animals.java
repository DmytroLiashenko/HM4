package lesson7;

public abstract class Animals {
    private String name;

    abstract void greets();

    public String getName() {
        return name;
    }

    public Animals(String name) {
        this.name = name;
    }
}
