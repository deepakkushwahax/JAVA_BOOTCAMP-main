package Pattern;

public class pattern7 {
    public static void main(String[] args) {
        ptt7(5);
    }
    static void ptt7(int n){
        for (int row = 1; row <=n ; row ++ ){
            for (int space = 0; space < n - row; space++){
                System.out.println(" ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col+ " ");
            }
            for (int col = 2; col <= row; col++){
                System.out.print(col +"  ");
            }
            System.out.println();
        }
    }
}