package lesson4;

public class Practices {
    public String name;
    public int age;
    public boolean live;
    public String sex;

    public void printInfo(){
        System.out.println("Name = "+name+"\nAge = "+countDay()+"\nSex ="+sex);
    }
    private int countDay(){
        return age*365;
    }
}
