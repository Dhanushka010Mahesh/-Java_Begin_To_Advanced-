package Lesson_02;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Middle_3 {
    
    private static Scanner scn=new Scanner(System.in);
    
    public static void main(String[] args) {
        systemDetails();
        getIntegerValueFromUser();
        String arr[]=createUserInputArr();
        printArray(arr);System.out.println();
        
        int[] aa={67,78,54,32,89,876,9,87};
        Middle_3 mm=new Middle_3();
        System.out.println("Event count = "+mm.searchEvenCount(aa));
    }
    
    public static void systemDetails(){
        System.out.println("Create DM");
        Date dd=new Date();
        System.out.println("2024-08-07 >>>>> "+dd.toString());
        System.out.println("GitHub Account -> Dhanushka010Mahesh");
    }
    public static int getIntegerValueFromUser(){
  
        System.out.print("Enter Number : ");
        return scn.nextInt();
    }
    public static String[] createUserInputArr(){
        int indexsCount=0;
        System.out.print("Array length Enter : "); 
        try{
            indexsCount=scn.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Enter valid index number");
        }
        
        String countrys[]=new String[indexsCount];
        System.out.println("Enter Array Element values");
        for(int i=0;i<countrys.length;i++){
            try{
                countrys[i]=scn.next();
            }catch(Exception e){
                System.out.println("invalid Value");
            }
        }
        
        return countrys;
    }
    public static void printArray(String[] arr){
        System.out.print("Array Element :> ");
        for(String a:arr){
            System.out.print(" "+a);
        }
    }
    
    public int searchEvenCount(int[] a){
        int count=0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
