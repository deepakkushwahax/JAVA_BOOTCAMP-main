package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 23, 4},
                {18, 12, 3, 9},
                {23, 52, 28, 20},
                {18,12}
        };
        int target = 52;
        int[] ans = Searching(arr, target);
        System.out.println(Arrays.toString(ans));



    }
    static int[] Searching(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }

                }
            }
        return new int[]{-1, -1};
    }
    }

