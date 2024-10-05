import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        double length=sc.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = area * length;
        System.out.println(area);
        System.out.println(volume);

    }
}
