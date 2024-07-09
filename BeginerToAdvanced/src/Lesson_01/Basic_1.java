package Lesson_01;

import java.util.Arrays;

public class Basic_1 {

    private String name = "Dhanushka"; //gorble variable
    //instance variable
    static char classCatagary = 'T';

    public static void main(String[] args) {

        int x; //decalaration
        x = 4;   //value asign
        short y = 8; //inizailation

        double weight = 46.6; //local variable
        System.out.println("hellow");

        long num = 888L;
        float numConvertion = num;
        System.out.println(numConvertion); //Widening convertion byte > short > int > long > float > double

        double num1 = 89.50;
        int a = (int) num1; //Narrowing Conversion

        String namee = "Mahesh";
        String numSimple = namee.toLowerCase();
        String numCapital = namee.toUpperCase();

        System.out.println(Math.pow(5, 3)); //power
        System.out.println(Math.PI); //pi value

        int[] aaa = {4, 7, 9, 5, 1, 0, 7, 89, 100};
        System.out.println("\n Array : ");
        for (int i = 0; i < aaa.length; i++) {
            System.out.print(aaa[i] + " < ");
        }
        System.out.println("\n Array sort : ");
        Arrays.sort(aaa);
        for (int i = 0; i < aaa.length; i++) {
            System.out.print(aaa[i] + " < ");
        }  //sorting data in array

        
    }
}
