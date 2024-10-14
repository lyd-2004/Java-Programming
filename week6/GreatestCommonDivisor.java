import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1=sc.nextInt();
        System.out.println();
        System.out.print("Enter the second integer: ");
        int num2=sc.nextInt();
        System.out.println();
        int number1=num1;
        int number2=num2;
        while(num2!=0) {
            int temp=num1%num2;
            num1=num2;
            num2=temp;
        }
        System.out.println("The greatest common divisor for "+number1+" and "+number2+" is "+num1);
    }
}
