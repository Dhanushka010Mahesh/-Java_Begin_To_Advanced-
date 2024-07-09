package Lesson_02;

import java.text.DecimalFormat;


public class Middle_1 {
    
    
    static DecimalFormat df=new DecimalFormat("0.00");//#.00
    public static void main(String[] args) {
        
        double x=87.876543234;
        System.out.println(df.format(x));
        
        String name="Dhanushka Mahesh";
        int age=21;
        String school="Nugawela central collage and Idamegama Central Collage";
        String intaik="S16-2023 and M24-2022";
        System.out.printf("%.3f%n", x);
        
        System.out.printf("Hello ! I \'am %s .my School is %s . I am %d years old .\n"
                + "I am study A/L Technology Stream and i get 3C pass .campus Batch %s ",name,school,age,intaik);
        
        final double pi=Math.PI;
        
    }
    
    
}
