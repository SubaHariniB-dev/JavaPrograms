import java.util.Scanner;
class simplecalculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int res=0;
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b= sc.nextInt();
        System.out.println("eneter the operation to perform:");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                res=a+b;
                System.out.println(res);
                break;
                case '-':
                    res=a-b;
                    System.out.println(res);
                    break;
                    case '*':
                        res=a*b;
                        System.out.println(res);
                        break;
                        case '/':
                            res=a/b;
                            System.out.println(res);
                            break;
                            case '%':
                                res=a%b;
                                System.out.println(res);
                                break;
                                default :
                                System.out.println("invalid operator");
        }
    }
}