import java.util.Scanner;
class arrayRowrotation{
    // left rotation
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the nuber of row:");
    int r=sc.nextInt();
    System.out.println("enter the number of column:");
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    System.out.println("eneter the matrix element:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++){
        leftrotate(a[i],i);
    }
    System.out.println("matrix after rotation:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }


static void leftrotate(int[]row,int k){
    int n=row.length;
    int[] temp=new int[k];

    for(int i=0;i<k;i++){
        temp[i]=row[i];

    }
    for(int i=k;i<n;i++){
        row[i-k]=row[i];
    }
    for(int i=0;i<k;i++){
        row[n-k-i]=temp[i];
    }
}
    }
