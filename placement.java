import java.util.Scanner;
class placement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of students placed in CSE:");
            int cse = sc.nextInt();
            System.out.println("enter the number of students placed in ECE:");
            int ece = sc.nextInt();
            System.out.println("eneter the number of students placed in MECH:");
            int mech = sc.nextInt();
            if(cse<0 ||ece<0 || mech<0){
                System.out.println("invalid input");
            }
            else if(cse==ece && ece==mech){
                System.out.println("none of them got higher placement");
            }
            else if(cse>ece && cse>mech){
                System.out.println("CSE got higher placement");
                 }
                 else if (mech>cse && mech>ece){
                    System.out.println("MECH got the higher placement");

                 }
                 else{
                    System.out.println("none of them got the higher placement");
                 }
    }
}