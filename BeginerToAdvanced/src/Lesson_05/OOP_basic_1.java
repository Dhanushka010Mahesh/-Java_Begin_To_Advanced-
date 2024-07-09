package Lesson_05;

public class OOP_basic_1 {
    
    String var1="Instance Variable";
    static String var2="Class Variable";
    
    
    public static void main(String[] args) {
        OOP_basic_1 car1=new OOP_basic_1("GTR", "Black", 350.7);
        OOP_basic_1 car2=new OOP_basic_1("SUSIKI", "Green", 120.5);
        OOP_basic_1 car3=new OOP_basic_1("LAMBOKINI", "Blue", 270.8);
        
        car1.checkDetails();
        car2.checkDetails();
        car3.checkDetails();
    }
    
    
    
    //this is car system
    //Attribute
    String model;
    String color;
    double speed;
    
    
    //behavior
    void carSound(){
        System.out.println("pip");
    }
    void drive(){
        
    }
    void checkDetails(){
        System.out.println("this is "+color+" color "+model+" car. max speed is "+speed);
    }
    
    
    //constractor

    public OOP_basic_1(String model,String color,double speed) { // no return type
        this.model=model;
        this.color=color;
        this.speed=speed;
    }
    
}
