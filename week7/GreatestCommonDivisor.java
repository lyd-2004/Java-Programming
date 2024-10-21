import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1=sc.nextInt();
        System.out.println("Enter second integer: ");
        int num2=sc.nextInt();
        System.out.println("The greatest common divisor for "+num1+" and "+num2+" is "+Find_GCD(num1,num2));
    }
    public static int Find_GCD(int num1,int num2) {
        if(num2==0) {
            return num1;
        }else{
            return Find_GCD(num2,num1%num2);
        }
    }
}
