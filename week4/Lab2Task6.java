import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        double KILLOGRAMS_PER_POUND = 0.45359237;
        double METER_PER_INCH = 0.0254;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        double Weight = weight * KILLOGRAMS_PER_POUND;
        double Height = height * METER_PER_INCH;
        double BMI = Weight/Height/Height;
        System.out.println("BMI is " + bmi);
    }
}
