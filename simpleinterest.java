import java.util.Scanner;
class simpleinterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal amount rate and time: ");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int interest=p*r*t;
        System.out.println("interest="+interest);
    }
}