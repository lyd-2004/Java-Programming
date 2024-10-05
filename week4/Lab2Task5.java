import java.util.Scanner;
public class Financial_Calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        int subtotal=sc.nextInt();
        int gratuity_rate=sc.nextInt();
        double gratuity=subtotal*gratuity_rate/100;
        double total=subtotal+gratuity;
        System.out.println("The gratuity is $"+gratuity+" and total is $"+total);

    }
}
