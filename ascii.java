import java.util.Scanner;
class ascii{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String n =sc.nextLine();
        for(int i=0;i<n.length();i++){
            int num =Integer.parseInt(n.substring(i,i+2));
            char ch=(char)num;
            System.out.println(ch);
        }
    }
}





