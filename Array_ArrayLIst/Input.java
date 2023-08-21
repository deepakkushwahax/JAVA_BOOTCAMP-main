package Array_ArrayLIst;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //String[] arr = new String[5];
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 20;
        arr[1] = 49;
        arr[2] = 25;
        arr[3] = 17;
        arr[4] = 19;
       // System.out.println(arr[3]);
        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(arr[3]);
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");

        }

        // input using the loops


    }
}