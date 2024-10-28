import java.util.Scanner;
public class Week8Task23 {
    public static void main(String[] args) {
        int[] array=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++) {
            if(i==0) 
                System.out.print("Enter 10 numbers: ");
            int number=sc.nextInt();
            array[i]=number;
        }
        for(int i=9;i>=0;i--) {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
