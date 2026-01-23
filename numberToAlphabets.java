import java.util.Scanner;
class numberToAlphabets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digits:");
        String num = sc.nextLine();
        if(num.length()<2){
            System.out.println("invalid input");
        }
        else{
        for(int i=0;i<num.length();i+=2){
            int digit =Integer.parseInt(num.substring(i,i+2));
            char ch = (char)digit;
            System.out.println(ch);
        }
    
     }
    }
}