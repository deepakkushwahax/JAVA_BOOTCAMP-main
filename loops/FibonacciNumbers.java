package loops;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //Q:-Find the nth fibonacci numbers
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n ){
            int temp = 1;
            n = b=a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }
}
