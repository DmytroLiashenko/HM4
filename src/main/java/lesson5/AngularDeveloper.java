package lesson5;

public class AngularDeveloper extends Employee {
    String name;

    public AngularDeveloper(String name) {
        super (name);
        this.name = name;
    }

    @Override
    String getPosition() {
        return "Angular Developer";
    }

    @Override
    String getSeniority() {
        return "Senior ";
    }


    @Override
    public String getInfo() {
        return super.getInfo()+" "+"is a "+getSeniority()+getPosition();
    }
}


