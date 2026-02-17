import java.util.Scanner;
class twodArray1{
    public static void main(String [] args){
        Scanner sc=  new Scanner(System.in);
        int [][] a=new int[3][];
        int r,c;
        r=sc.nextInt();
        
        for(int i=0;i<r;i++){
           
            System.out.print("enter the c:");
            c=sc.nextInt();
            a[i]=new int[c];
      
        for(int j=0;j<c;j++){
          a[i][j]=sc.nextInt();
        }
        }
        System.out.println("matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+ " ");
            }
            System.out.println();
        }


        
    }
}