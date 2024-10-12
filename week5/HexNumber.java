import java.util.Scanner;
public class HexNumber {
    public static void main(String[] args) {
        System.out.println("Enter a decimal value(0 to 15):");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>=0 && number<=15){
            if(number>=10)
            {
                System.out.println("The hex value is "+(char)('A'+number-10));
            }else{
                System.out.println("The hex value is "+number);
        }else{
            System.out.println(number+" is an invalid input");
        }
    }
}
