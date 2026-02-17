import java.util.Scanner;
class sumofcolumn{
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
        for(int i=0;i<r1;i++){
            int sum=0;
             
            for(int j=0;j<c1;j++){
                sum+=a[j][i];
                
                
            }
            System.out.println("sum is:"+sum);
           
        }
        


        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j] +" ");
                
            }
            System.out.println();
        }
        
    }
}