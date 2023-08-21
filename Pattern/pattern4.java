package Pattern;

import org.w3c.dom.ls.LSOutput;

public class pattern4 {
    public static void main(String[] args) {
    ptt4(5);
    }
    static void  ptt4(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
