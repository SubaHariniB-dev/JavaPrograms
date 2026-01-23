import java.util.Scanner;
class seasons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month:");
        int month = sc.nextInt();
        if(month<1 || month>12){
            System.out.println("invalid input");
        }
            else if(month>=3 && month<=5)
            {
                System.out.println("season: spring ");
            }
            else if(month>=6 && month <= 8){
                System.out.println("season : summer");
            }
            else if(month>=9 && month<=11){
                System.out.println("season : autumn");

            }
            else{
                System.out.println("season : winter");
            }
        }
    }
