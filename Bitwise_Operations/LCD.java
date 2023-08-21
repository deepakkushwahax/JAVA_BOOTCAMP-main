package Bitwise_Operations;

public class LCD {
    public static void main(String[] args) {
        System.out.println(lcm(2,7));
    }
    static int lcd(int a, int b){
        if (a == 0){
            return b;
        }
        return lcd(b%a , a);

    }
    static int lcm(int a, int b){
        return a * b / lcd(a,b);
    }

}
