import java.util.Scanner;
public class Week8Task12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int num=sc.nextInt();
        double ave=0;
        for(int i=0;i<num;i++) {
            if(i==0) 
                System.out.print("Enter the numbers: ");
            double number=sc.nextDouble();
            ave=ave+number;
        }
        ave=ave/num;
        int gta=(int)ave+1;
        System.out.println("Average is "+ave);
        System.out.println("Number of elements above the average is "+gta);
        sc.close();
    }
}
