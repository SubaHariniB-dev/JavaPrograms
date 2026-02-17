import java.util.Scanner;
class gcd{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}