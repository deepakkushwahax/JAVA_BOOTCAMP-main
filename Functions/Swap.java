package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Deepak Kushwaha";
        changeName(name);
        System.out.println(name);

        //System.out.println(naam);
        int num = 40;
    }
    static void changeName(String naam) {
        naam = "Rahul rana";
        int num = 10;
        int b = 20;
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    }

