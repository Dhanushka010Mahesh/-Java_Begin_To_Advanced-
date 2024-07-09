package Lesson_02;

public class Middle_4 {
    public static void main(String[] args) {
        int x=sumIterativeWay(6);
        System.out.println(x);//itarative
        
        System.out.println("\n Final sum : "+sumRecursive(6));
        
        System.out.println();
        int y=fibonacciNumberFind(8);
        System.out.println(y);
    }
    private static int sumIterativeWay(int num){
        int sum=0;
        for(int a=0;a<=num;a++){
            sum += a;
        }
        return sum;
    }
    
    public static int sumRecursive(int num){
        if(num==1){
            System.out.println("base");
            return 1;
        }
        int x=num+sumRecursive(num-1);
        System.out.print(" "+x);// + used for concatination 
        return x;
    }
    
    public static int fibonacciNumberFind(int indexPlace){
        if(indexPlace==1 || indexPlace==0){
            return indexPlace;
        }
        
        return fibonacciNumberFind(indexPlace-1)+fibonacciNumberFind(indexPlace-2);
    }
}
