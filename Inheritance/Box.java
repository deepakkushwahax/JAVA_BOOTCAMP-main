package Inheritance;

public class Box {
    float salary = 40000;
}
class Programmer extends Box{
    int bonus = 1000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" +p.salary);
        System.out.println("Bonus of Programmer is: "+p.bonus);
    }
}



