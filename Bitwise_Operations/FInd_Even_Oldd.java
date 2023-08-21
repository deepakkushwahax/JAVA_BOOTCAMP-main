package Bitwise_Operations;

import javax.swing.*;
import java.util.Scanner;


public class FInd_Even_Oldd {
    public static void main(String[] args) {
        int n = 66 ;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
