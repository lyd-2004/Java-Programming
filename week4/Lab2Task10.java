import java.util.Scanner;
public class Financial_Compound2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double saving=sc.nextDouble();
        double value=0;
        for(int i=1;i<=6;i++) {
            value=(value+saving)*(1+0.00417);
        }
        System.out.println("After the sixth month, the account value is $"+value);
    }
}
