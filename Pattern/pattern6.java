package Pattern;

public class pattern6 {
    public static void main(String[] args) {
ptt6(5);
    }
    static void ptt6(int n){
        for (int row = 0; row < 2*n; row++){
            int totalColInRow = row > n ? 2 *n -row: row;
            int noOfSpaces = n - totalColInRow;
            for (int s = 0; s < noOfSpaces; s++){
                System.out.println(" ");
            }
            for (int col = 0; col < totalColInRow ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
