package Oops;

import java.rmi.StubNotFoundException;

public class Main {
    public static void main(String[] args) {
        // Store 5 roll no
//        int[] numbers = new int[5];

        // Store 5 names
//        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];

          Student Deepak = new Student();
          Deepak.greeting();
//        Deepak.rno = 13;
//        Deepak.name = "Deepak Kushwaha";
//        Deepak.marks = 80.8f;
        System.out.println(Deepak.rno);
        System.out.println(Deepak.name);
        System.out.println(Deepak.marks);

    }
}
    // Create Class
class Student {
        int rno;
        String name;
        float marks;

        void greeting(){
            System.out.println("Hello MY name is "+name);
        }


        Student(){
          this.rno = 13;
          this.name = "Deepak Kushwaha";
          this.marks = 80.8f;
        }
        Student(int rno, String name, float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;
        }

    }