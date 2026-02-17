import java.util.Scanner;
class palindrom{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number to check the palindrom:");
        int  num = sc.nextInt();
        int digit=0;
        int rev=0;
        int org=num;
        while(num!=0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
    }
    if(org==rev){
        System.out.println("palindrom number");
    }
    else{
        System.out.println("not a palindrom number");
    }
    }
}