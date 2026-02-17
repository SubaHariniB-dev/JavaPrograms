import java.util.Scanner;
class harshad{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int org=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        if(org%sum==0){
            System.out.println("the number is a harshad number");
        }
        else{
            System.out.println("the number is not a harshad number");
        }
        
    }
}