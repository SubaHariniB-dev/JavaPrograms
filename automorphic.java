import java.util.Scanner;
class automorphic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int org=num;
        int square=num*num;
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        int lastdigit=square %(int)Math.pow(10,count);
        if(lastdigit==org)
        {
            System.out.println("the number is automorphic:");
        }
        else{
            System.out.println("not an automorphic number");
        }
    }
}