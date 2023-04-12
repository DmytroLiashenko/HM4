package lesson5;

public class ManualTestEngineer extends Employee {
    final String lastName;

    public ManualTestEngineer(String name,String lastName) {
        super (name);
        this.lastName = lastName;
    }

    @Override
    String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    String getSeniority() {
        return "Senior ";
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" "+lastName+" is a "+getSeniority()+getPosition();
    }
}
