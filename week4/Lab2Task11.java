import java.util.Scanner;
public class Sales_Tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double account=sc.nextDouble();
        double tax=account*0.06;
        System.out.println("Sales tax is $"+tax);
    }
}
