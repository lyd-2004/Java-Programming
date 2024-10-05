import java.util.Scanner;
public class ReadingFromKeyboard {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Byte value: ");
        byte byteValue=input.nextByte();
        System.out.print("The byte value is: "+byteValue);
        System.out.print("Enter a Short value: ");
        short shortValue=input.nextShort();
        System.out.print("The short value is: "+shortValue);
        System.out.print("Enter a float value: ");
        float floatValue=input.nextFloat();
        System.out.print("The float value is: "+floatValue);
    }
}
