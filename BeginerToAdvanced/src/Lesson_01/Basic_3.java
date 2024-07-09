package Lesson_01;

import java.util.Scanner;

public class Basic_3 {

    public static void main(String[] args) {
        //sequance  = up to down
        System.out.println("Hello World");
        System.out.println("I\'am Dhanushka Mahesh");
        System.out.println("Studing Moratuwa and Sliate");

        //selection
        int age = 21;
        String resultAge = (age > 26) ? "Not student" : "Student";
        System.out.println(resultAge);

        double grade = 2.5;
        if (grade > 0 && grade < 4) {
            if (grade < 1.5) {
                System.out.println("Fail (D)");
            } else if (grade <= 2) {
                System.out.println("Weak Pass (-C)");
            } else if (grade <= 2.7) {
                System.out.println("Pass (C)");
            } else if (grade <= 3.7) {
                System.out.println("Good (B)");
            } else {
                System.out.println("Excellent (+A)");
            }
        }

        //repetition stucture
        /* do-while */
        int max = 0, inputUser;
        Scanner sr = new Scanner(System.in);//import java.util.Scanner;
        do {
            System.out.print("Enter number : ");
            inputUser = sr.nextInt();
            if (inputUser > max) {
                max = inputUser;
            }
        } while (inputUser != ~0);
        System.out.println("Max value is : "+max);

        /*while loop */
        System.out.print("Enter number please : ");
        int UserInput=sr.nextInt();
        while (UserInput >= 1) {
            if (UserInput % 2 != 0) {//test many variable
                System.out.print(UserInput + " ");
            }
            UserInput--;
        }

        /* switch */
        System.out.println();
        int day = 2;
        String dayName="";
        //0 or 8... >> exit
        //1 monday
        switch (day) { // test only one variable(char,byte,short)
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="Tuesday";
                break;
            case 3:
                dayName="Wedstday";
                break;
            case 4:
                dayName="Thustday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Sataday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println(dayName);
        
        
        /* for loop */
        for (int i = 1; i <= 10; i++) {
            if(i==4){
                continue;
            }
            System.out.print(i*i +"_");
        }
        
        /* for-each */
        System.out.println();
        String [] campuss={"Moratuwa","Sliate","Jaffna","Colombo","Kalaniya"};
        for(String i:campuss){
            System.out.print(" "+i);
        }
    }
}
