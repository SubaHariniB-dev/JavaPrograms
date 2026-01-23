import java.util.Scanner;
class fuelConsuption{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of liters to fill the tank:");
         double liters =sc.nextDouble();
         System.out.println("enter the distance covered :");
         double distance = sc.nextDouble();
         if(liters<=0 || distance<=0){
            System.out.println("invalid input");
         }
            else{
                double litersper100km = liters/distance *100;
                double miles = distance*0.6214;
                double gallons = liters*0.2642;
                double milespergallon = miles/gallons;
                System.out.println("(liters/100km)%.2f\n"+litersper100km);
                System.out.println("(miles/gallons)%.2f\n"+ milespergallon);
            }
         
    }
}