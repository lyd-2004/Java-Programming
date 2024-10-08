import java.util.Scanner;
public class Lab2Task8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double length=sc.nextDouble();
        double area=3*Math.sqrt(3)/2*length*length;
        System.out.println("The area of the hexagon is "+area);
    }
}
