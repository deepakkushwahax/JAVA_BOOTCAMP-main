package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 2, 3, 4, 5, 7, 8, 9);

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
