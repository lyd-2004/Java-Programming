import java.util.Scanner;
public class RepeatPrints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message=sc.next();
        System.out.println("Enter the repeat times(number): ");
        int n=sc.nextInt();
        nPrintln(message,n);
    }
    public static void nPrintln(String message,int n) {
        for(int i=0;i<n;i++) {
            System.out.println(message);
        }
    }
}
