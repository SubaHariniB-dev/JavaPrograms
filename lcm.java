import java.util.Scanner;
class lcm{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        int originalA=a;
        int originalB=b;
        while(b!=0){
            int temp =b;
            b=a%b;
           a=temp;

        }
        int gcd=a;
        int lcm=(originalA*originalB)/gcd;
        System.out.println(lcm);


    }
}