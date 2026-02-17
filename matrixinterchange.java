import java.util.Scanner;
class matrixinterchange{
    public static void main(String [] args){
        Scanner sc=  new Scanner(System.in);
        int r1,c1;
        System.out.println("enter r1");
        r1=sc.nextInt();
        System.out.println("enter c1:");
        c1=sc.nextInt();
        int temp=0;
         int [][] a=new int[r1][c1];
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                if(i==0){
                     temp=a[i][j];
                    a[i][j]=a[r1-1][j];
                    a[r1-1][j]=temp;

                 

                }

            }

        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}