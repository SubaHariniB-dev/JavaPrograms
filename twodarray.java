import java.util.Scanner;
class twodarray{
    public static void main(String [] args){
        Scanner sc=  new Scanner(System.in);
        int [][] a=new int[3][3];
        int [][] b=new int[3][3];
        int [][] c=new int[3][3];
        System.out.println("enter the elements of the first array:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of the second array:");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }


        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.print(c[i][j] +" ");
                
            }
            System.out.println();
        }
    }
}