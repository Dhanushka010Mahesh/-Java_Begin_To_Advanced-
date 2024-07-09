package Lesson_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Middle_2 {

    public static void main(String[] args) {
        //compiler err
        /* 
            int x=56
            double y="srting";
         */
        //logical error
        int lengthRetangle = 5;
        int area = lengthRetangle * 2;
        //runtime error

        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter Integer Number : ");
            scan.nextInt();
        } catch (Throwable e) {
            System.out.println(e);
        }

        int[] arr = {3, 4, 5, 6, 7, 0};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception is " + e);
        } finally {
            System.out.println("System End");
        }

        try {
            System.out.print("Enter array index number : ");
            int arrIndex = scan.nextInt();
            int arrIndex1 = scan.nextInt();
            double multy = arr[arrIndex] / arr[arrIndex1];
        } catch (InputMismatchException i) {
            System.out.println("Enter correct index value int");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("array out of index value");
        } catch (ArithmeticException a) {
            System.out.println("cant multy by 0");
        } finally {
            System.out.println("End");
        }

        
        
        
        
        
        
        
        try {
            myOwer oo=new myOwer();
            oo.setName("Mahesh");
            oo.setName("D3");
        } catch (myException e) {
            System.out.println(e.getName());
        }
    }

}

class myOwer {

    public void setName(String n) throws myException {
        if (n.equalsIgnoreCase("Mahesh")) {
            System.out.println("option 1");
        } else {
            String name = "Dhanushka";
            throw new myException(name);
        }
    }

}

class myException extends Exception {

    private String name;

    public myException(String ss) {
        this.name = ss;
    }

    public String getName() {
        return this.name;
    }
}
