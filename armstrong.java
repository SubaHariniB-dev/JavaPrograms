import java.util.Scanner;
class armstrong{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a 3 digit number:");
        int num=sc.nextInt();
        int org=num;
        int sum=0;  
        while(num!=0){
            int digit=num%10;
            sum+=Math.pow(digit,3);
            num=num/10;
        }
        if(sum==org){
            System.out.println("armstrong number");
        }
        else{
            
            System.out.println("not an armstrong number");
        }
    }
}