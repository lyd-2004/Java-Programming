import java.util.Scanner;
public class Lab2Task13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your pay: ");
        double pay=sc.nextDouble();
        System.out.println("Your pay without increment is: "+pay);
        System.out.print("Enter your score: ");
        double score=sc.nextDouble();
        if(score>=90) {
            pay=pay*1.03;
        }else{
            pay=pay*1.01;
        }
        System.out.println("your pay with increment is " +pay);
    }
}
