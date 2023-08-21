package Oops;

public class Wrapper_class {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer num = 45;
       
        System.out.println(a+" "+b);

    }
    void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
