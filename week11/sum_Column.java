import java.util.Scanner;
public class sum_Column {
    public static void main(String[] args) {
        double[][] m=new double[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                m[i][j]=sc.nextDouble();
            }
        }
        for(int i=0;i<4;i++) {
            double sum=sumColumn(m, i);
            System.out.println("Sum of the elements at column "+i+" is "+sum);
        }
        sc.close();
    }
    public static double sumColumn(double[][] m,int columnIndex) {
        double sum=0;
        for(int i=0;i<m.length;i++) {
            sum+=m[i][columnIndex];
        }
        return sum;
    }
}
