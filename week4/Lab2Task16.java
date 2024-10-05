import java.util.Scanner;
public class Determining_Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=sc.nextInt();
        boolean isLeapYear=(year%4==0 && year%100!=0) || (year%400==0);
        if(!isLeapYear) {
            System.out.println(year+" isn't a leap year.");
        }else{
            System.out.println(year+" is a leap year.");
        }
    }
}
