package lesson5;

public class JavaDeveloper extends Employee{
    String name;

    public JavaDeveloper(String name) {
        super (name);
        this.name = name;
    }

    @Override
    String getPosition() {
        return " Java Developer";
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

