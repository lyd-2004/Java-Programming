import java.util.Scanner;
import java.util.Random;
public class Price {
    public static void main(String[] args) {
        Random sc=new Random();
        int price_number=sc.Random(100);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        int number=sc.nextInt();
        System.out.println("The lottery number is: "+price_number);
        if(price_number/10==number/10 && price_number%10==number%10) {
            System.out.println("Exact match: you win $10,000");
        }else if(price_number/10==number%10 && price_number%10==number/10) {
            System.out.println("Match all digits: you win $3,000");
        }else if((price_number%10==(number%10 || number/10)) || (price_number/10==(number%10 || number/10))) {
            System.out.println("Match one digit: you win $1,000");
        }else {
            System.out.println("Sorry: no match");
        }
    }
}
