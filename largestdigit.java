import java.util.Scanner;
class largestdigit{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int largest=0;
    int temp=num;
    while(temp>0){
        int digit=temp%10;

        if(digit>largest){
            largest=digit;

        }
        temp=temp/10;
    }
    System.out.println(largest);
}
}







