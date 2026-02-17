import java.util.Scanner;
class table{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i+ "*"+n +" "+ i*n);
        }
    }
}