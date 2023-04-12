package lesson5;

public class Manager extends Employee{
    final String lastName;
    Employee[] team = new Employee[4];


    public Manager(String name,String lastName) {
        super (name);
        this.lastName = lastName;
    }

    @Override
    String getPosition() {
        return "Manager";
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
        String a="";
        for  (Employee oneOfTheTeam : this.team){
            a = a.concat(oneOfTheTeam.getName())+" ";
        }
        return super.getInfo()+" "+lastName+" is a "+getSeniority()+getPosition()+ "and has a team of 4 members:" +a;
    }

    public void setTeamMembers(Employee...members) {
        this.team=members;
    }
}

