import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");        
        double radius=sc.nextDouble();
        double length=sc.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = area * length;
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
    }
}
