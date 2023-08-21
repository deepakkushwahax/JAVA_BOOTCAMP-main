package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 1220;
        int b = 20;
        {
            a = 78;
            System.out.println(a);
            int c = 99;
        }
        System.out.println(a);
        // can't use outside the block

    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
