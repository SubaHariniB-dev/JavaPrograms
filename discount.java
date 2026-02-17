import java.util.Scanner;
class discount{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the price amount:");
        double price=sc.nextDouble();
        System.out.println("enter the discount percentage:");
        double discount=sc.nextDouble();
        double discountamount=(price*discount)/100;
        double priceafterdiscount=(price-discountamount);
        System.out.println("discount amount:"+discountamount);
        System.out.println("final price:"+priceafterdiscount); 

    }
}