package Pattern;

public class pattern2 {

    public static void main(String[] args) {

        ptt2(5);
    }

    static void ptt2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

}
