package Lesson_01;

public class Basic_4 {
    public static void main(String[] args) {
        //selection if,switch
        //itaration do-while,while,for
        //jump continue break
        
        String names[]={"Dhanushka","Mahesh","Eranga","Jayarathna"}; //Declaring and Initializing an Array
        char[] grade=new char[]{
            'A','B','C','D'
        };
        
        int[] ages;  //Declaring an Array
        String country[]=new String[128];
        
        ages=new int[]{21,18,15,12,5};
        country[0]="Sri Lanka";
        country[1]="Japan";
        country[2]="Korean";
        
        
        
        System.out.println("My country is "+country[0]);
        System.out.println(ages.length);
        String myName="D  HAN US,HK A";
        System.out.println(myName.length());
        
        System.out.println(myName);
        String[] nameCollect=myName.split(" ");
        printArray(nameCollect);
        
        System.out.println(myName);
        String nameMy=myName.replaceAll("\\s","");
        
        
        //demention arrays
        double[][] daySales=new double[365][];
        daySales[0]=new double[20];
        daySales[1]=new double[]{34779.8,67098,8754.87,65367,987678.98};
        System.out.println();
        
        String vavolsWords[][]={
            {"Elipent","english"},
            {"Apple","Area"},
            {"orange","o"},
            {"umberella","under"},
            {"itaration","i"}
        };
        Basic_4 bb=new Basic_4();
        bb.print2DArray(vavolsWords);
        
    }
    private static void printArray(String [] x){
        for(String xx:x){
            System.out.print(xx+"-");
        }
    }
    private void print2DArray(String arr[][]){
        int i=0;
        while(i<=4){
            for(int j=0;j<2;j++){
                String word=arr[i][j];
                System.out.print(word +" ");
            }
            i++;
            System.out.print(" >>>> ");
        }
    }
}
