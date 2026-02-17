import java.util.Scanner;
class perfect{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in );
        System.out.println("enter a number to check whether it is perfect or not:");
        int num=sc.nextInt();
        int org=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
            if(sum==org){
            System.out.println("perfect number");
            }
            else{
                System.out.println("not a perfect number");
            }
        
    }
}