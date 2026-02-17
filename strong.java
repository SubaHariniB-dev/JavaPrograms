import java.util.Scanner;
class strong{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            System.out.println("enter a number:");
              int num=sc.nextInt();
              int org=num;
              int sum=0;
              while(num!=0){
                int digit=num%10;
                int fact=1;
                for(int i=1;i<=digit;i++){
                    fact=fact*i;
                }
                sum+=fact;
                num=num/10;
              }
              if(sum==org){
                System.out.println("strong number");
              }
              else{
                System.out.println("not a strong number");
              }

        
    }
}