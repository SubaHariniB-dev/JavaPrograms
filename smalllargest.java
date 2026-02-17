import java.util.Scanner;
class smalllargest{
    public static void main(String [] args){
        Scanner sc=  new Scanner(System.in);
        int r1,c1;
        System.out.println("enter r1");
        r1=sc.nextInt();
        System.out.println("enter c1:");
        c1=sc.nextInt();
        
         int [][] a=new int[r1][c1];
        
        
        
     
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int large=0;
        int small=a[0][0];
        for(int i=0;i<r1;i++){
            
             
            for(int j=0;j<c1;j++){
                if(a[i][j]>large){
                    large=a[i][j];
                }
                
                
            }
           
           
        }
        System.out.println("largest element"+large);
        for(int i=0;i<r1;i++){
            
             
            for(int j=0;j<c1;j++){
                if(a[i][j]<=small){
                    small=a[i][j];
                }
                
                
            }
           
           
        }
        System.out.println("smallest:"+small);
        


        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j] +" ");
                
            }
            System.out.println();
        }
        
    }
}