import java.util.Scanner;
class leader2{
    public static void main(String[] args){
        int [] a= {9,1,7,6,5  };
        
       int max=a[a.length-1];
       System.out.println(max);
       for(int i=a.length-2;i>=0;i--){
        if(a[i]>max){
            max=a[i];
            System.out.println(max)
       }
       }
       

    }
}