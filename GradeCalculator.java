import java.util.Scanner;
class GradeCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter your mark:");
        int mark=sc.nextInt();
        
            if(mark>=90){
                System.out.println("A");
        }
                else if (mark>=75 && mark<=89){
                    System.out.println("B");
        }

                    else if(mark>=60 && mark<=74){
                        System.out.println("C");
        }
                        else if(mark>=40 && mark<=59){
                            System.out.println("D");
        }
                            else if (mark<40){
                            System.out.println("fail");
                            }
                        
                            else{
                            System.out.println("invalid input");
                            }
        }
    }
