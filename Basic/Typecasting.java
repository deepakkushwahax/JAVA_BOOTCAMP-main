package Basic;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // Type Casting
//        int num = (int)(52.45f);
//        System.out.println(num);

        // Automatic type prommtion in expressions
//        int a = 40;
//        byte b = (byte)(a);

          byte a = 40;
          byte b = 50;
          byte c = 100;
          int d =  a * b / c;
        System.out.println(d);


}
}