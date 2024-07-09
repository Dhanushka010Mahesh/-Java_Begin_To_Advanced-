package Lesson_03;

public class Advanced_2 {
    
    public String name="Dhanushka";
    private String name1="Dhanushka";
    protected String indexNumber="E2240438";
    
    
    public static void main(String[] args) {
        Advanced_1 a1=new Advanced_1();
        a1.indexNumber="E2240438";//class 1 public
        
        /*
        Advanced_1 aa1=new Advanced_1();
        a1.indexNumber1="E2240438";//class 1 private
        */
        
        Advanced_1 aa1=new Advanced_1();
        a1.indexNumber2="E2240438";//class 1 default
        
        Advanced_1 frist=new Advanced_1();
        frist.name="Mahesh";//class 1 protected
    }
}
