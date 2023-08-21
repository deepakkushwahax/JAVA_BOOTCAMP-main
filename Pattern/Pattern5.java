package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
    ptt5(5);
    }
    static void ptt5(int n){
        for (int row = 0 ; row < 2*n; row++){
            int totalColInRow = row > n ? 2 -row: row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
