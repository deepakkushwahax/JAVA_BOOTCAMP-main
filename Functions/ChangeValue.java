package Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Creating the array here
        int[] arr = {1 ,3, 2, 45, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;

    }
}
