import java.util.Scanner;
class neon{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int square=num*num;
        int sum=0;
        int digit=0;
        while(square>0){
            digit=square%10;
            sum=sum+digit;
            square=square/10;
        }
        if(sum==num){
            System.out.println("it is a neaon number");

        }
        else{
            System.out.println("it is not a neaon number");
        }
    }
}