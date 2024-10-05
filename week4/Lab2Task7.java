import java.util.Scanner;
public class Driving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the driving distance:");
        double distance=sc.nextDouble();
        System.out.println("Enter miles per gallon:");
        double MILES_PER_GALLON=sc.nextDouble();
        System.out.println("Enter price per gallon:");
        double PRICE_PER_GALLON=sc.nextDouble();
        double cost=distance/MILES_PER_GALLON*PRICE_PER_GALLON;
        System.out.println("The cost of driving is $"+cost);
    }
}
