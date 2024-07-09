package Lesson_04;

import Lesson_03.Advanced_1;
import Lesson_03.Advanced_2;

public class Advanced_3 {
    
    public String indexNumber="E2240438"; 
    private String indexNumber1="E2240438";
    String indexNumber2="E2240438";
    protected String sIndexNumber="KAN/IT/2002/F/0055";
    
    public static void main(String[] args) {
        Advanced_3 a3=new Advanced_3();
        a3.indexNumber="KAN/IT/2002/F/0055"; //class 3 public
        
        Advanced_2 a2=new Advanced_2();
        a2.name="Mahesh";//class 2 public
        
        Advanced_1 a1=new Advanced_1();
        a1.indexNumber="E2240438";//class 1 public
        
        
        
        
        Advanced_3 aa3=new Advanced_3();
        a3.indexNumber1="KAN/IT/2002/F/0055"; //class 3 private
        
        /*
        Advanced_2 aa2=new Advanced_2();
        a2.name1="Mahesh";//class 2 private
        */
        
        /*
        Advanced_1 aa1=new Advanced_1();
        a1.indexNumber1="E2240438";//class 1 private
        */
        
        
        
        
        
        Advanced_3 aaa3=new Advanced_3();
        a3.indexNumber2="KAN/IT/2002/F/0055"; //class 3 default
        
        /*
        Advanced_2 aaa2=new Advanced_2();
        a2.name2="Mahesh";//class 2 default
        */
        
        /*
        Advanced_1 aaa1=new Advanced_1();
        a1.indexNumber2="E2240438";//class 1 default
        */
        
        
        
        
        Advanced_3 frist=new Advanced_3();
        frist.sIndexNumber="E2240438"; //class 3 protected
        
        /*
        Advanced_2 secound=new Advanced_2();
        secound.indexNumber="KAN/IT/2002/F/0055";//class 2 protected
        */
        
        /*
        Advanced_1 thrid=new Advanced_1();
        thrid.name="Mahesh";//class 1 protected
        */
    }
}
