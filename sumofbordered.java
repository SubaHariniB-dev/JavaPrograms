import java.util.Scanner;
class sumofbordered{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print ("enter the row");
        int r=sc.nextInt();
        System.out.print("enter the column");
        int c=sc.nextInt();
        int [][] arr=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int j=0;j<c;j++){
            sum+=arr[0][j];
        
        }
        
        for(int j=0;j<c;j++){
            sum+=arr[r-1][j];
        }
        for(int i=0;i<r;i++){
            sum+=arr[i][0];
        }
        for(int i=0;i<r;i++){
            sum+=arr[i][c-1];
        }
        System.out.println("sum is:"+ sum);

    }
}