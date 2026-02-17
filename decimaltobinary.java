import java.util.Scanner;
class decimaltobinary{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
     String binary=Integer.toOctalString(num);
     System.out.println(binary);
     System.out.println(Integer.toHexString(num).toUpperCase());
     
    }
}