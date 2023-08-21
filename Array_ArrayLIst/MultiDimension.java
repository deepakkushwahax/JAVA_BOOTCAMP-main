package Array_ArrayLIst;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = new int[2][];

        Scanner in = new Scanner(System.in);

        int[][] arr1 = {
            {1, 2, 3},
            {4, 5 ,6},
            {5, 7, 9}
        };
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1[1]));
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int[]{in.nextInt()};

        }

    }

}
