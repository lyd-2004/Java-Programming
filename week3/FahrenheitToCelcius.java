import java.util.Scanner;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double Fahrenheit=input.nextDouble();
        double Celcius=(Fahrenheit-32)*5.0/9;
        System.out.println("Fahrenheit: "+Fahrenheit+" is "+Celcius+" in Celcius.");
    }
}