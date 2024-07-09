package Lesson_01;

public class Basic_2 {

    public static void main(String[] args) {
        
        //Assaignment oparation
        int xy = 5;
        int numx1, numx2, numx3;
        numx1 = numx2 = numx3 = xy + 5;

        //arithmatic oparation
        int a=2*2;
        int b=4/2;
        int c=5%3;
        int d=2;
        d++;//d=d+1; post fix
        ++d;//pre fix
        System.out.println(d--);
        int e=4-7+8;
        
        //relation oparation
        String aa=(a>=b)?"A is the max number":"B is max number";
        boolean bb=a == b;
        boolean cc= !(a != b);
        
        //logical oparation
        boolean A= true && true;
        boolean B= !(true) || (a<b);
        
        //bitwise oparation
        System.out.println("5 & 2 = " +(5&2)); //101 and 010 = 000
        byte C=5 | 2; //8 bit can store
        short D=5<< 2; //16 bit
        System.out.println(D);
        System.out.println("5>>2 = "+(5>>2));
        System.out.println("true xor false = "+(true^false));
        System.out.println(~(-2));  
        System.out.println(~1);
        
        
    }
    
}
