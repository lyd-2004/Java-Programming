import java.util.Scanner;
public class Week8Task22 {
    public static void main(String[] args) {
        double[] array=new double[10];
        double Min;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++) {
            if(i==0) 
                System.out.print("Enter 10 numbers: ");
            double number=sc.nextDouble();
            array[i]=number;
        }
        Min=min(array);
        System.out.println("The minimum number is "+Min);
        sc.close();
    }
    public static double min(double[] array) {
        double min=array[0];
        for(int i=1;i<10;i++) {
            if(array[i]<min) {
                min=array[i];
            }
        }
        return min;
    }
}
