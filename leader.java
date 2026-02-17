import java.util.Scanner;
class leader{
    public static void main(String[] args){
        int [] a= {9,1,7,6,5  };
        
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    
                    count++;

                 
                   
                }
                if(count==a.length-i-1){ 
                     System.out.println(a[i]);

                }

            }
             
        }
    }
}