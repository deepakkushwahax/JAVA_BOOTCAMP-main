package Pattern;

public class pattern1 {
    public static void main(String[] args) {
        ptt1(5);
    }

    static void ptt1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}