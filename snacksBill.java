import java.util.Scanner;
class snacksBill{
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         int pizza_price = 100;
         int puffs_price =25;
         int coolDrinks_price =15;
         System.out.println("enter the no of pizza:");
         int pizza = sc.nextInt();
         System.out.println("enter the no of puffs:");
         int puffs = sc.nextInt();
         System.out.println("enter the no of cool drinks:");
         int cooldrinks=sc.nextInt();
         int total_price =(pizza_price*pizza)+(puffs_price*puffs)+(coolDrinks_price*cooldrinks);
         System.out.println("total bill amount:"+total_price);

    }
}