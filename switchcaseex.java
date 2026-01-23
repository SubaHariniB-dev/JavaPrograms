import java.util.Scanner;
class switchcaseex{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the day as number:");

        int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("monday");
                break;
                case 2:
                    System.out.println("tuesday");
                    break;
                    case 3:
                        System.out.println("wednesday");
                        break;
                        case 4:
                            System.out.println("thrusday");
                            break;
                            default :
                            System.out.println("invalid day");

        }
    }
}