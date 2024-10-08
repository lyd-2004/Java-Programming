import java.util.Scanner;
public class Lab2Task14 {
    public static void main(String[] args) {
        double KILLOGRAMS_PER_POUND=0.45359237;
        double METER_PER_INCH=0.0254;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight=sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height=sc.nextDouble();
        double weight_In_Killograms=weight*KILLOGRAMS_PER_POUND;
        double height_In_Meter=height*METER_PER_INCH;
        double BMI=weight_In_Killograms/height_In_Meter/height_In_Meter;
        System.out.println("BMI is "+BMI);
    }
}
