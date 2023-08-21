package Array_ArrayLIst;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(2340);
//        list.add(254);
//        list.add(20);
//        list.add(22);
//        list.add(2020212);
//        list.add(1978450);
//        list.add(201);
//        list.add(24578);
//        list.add(201212);
//        list.add(45784);
//        list.add(201245);
//        list.add(204578);
//        list.add(204578);
//        list.add(20457);
//        list.add(20124);
//        list.add(201012);
//        System.out.println(list.contains(20124));
//        System.out.println(list.contains(20124454));
//        System.out.println(list);

        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5 ; i++){
            System.out.println(list.get(i));
        }
 //       System.out.println(list);

    }

}
