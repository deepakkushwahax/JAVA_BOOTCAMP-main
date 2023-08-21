package Switch;

import javax.management.MBeanAttributeInfo;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        if (Objects.equals(fruit, "Mango")) {
//            System.out.println("king of fruit");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }

        if (fruit.equals("Mango")) System.out.println("King of fruits");
        else if (fruit.equals("Apple")) {
            System.out.println(" Apple is a red fruits");
        } else if (fruit.equals("Orange")) {
            System.out.println("Round fruits");
        } else if (fruit.equals("Grapes")) {
            System.out.println("Small sweets fruits");


            System.out.println("Please Enter the valid fruits");
        } else {
            System.out.println("Please Enter the valid fruits");
        }

    }
}
