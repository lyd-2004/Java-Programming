import java.util.Scanner;
public class ComputeAngles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three corner points: ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
        double a=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double b=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        double c=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        double A=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B=Math.toDegrees(Math.acos((b*b-c*c-a*a)/(-2*a*c)));
        double C=Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
        System.out.println("The three angeles are "+Math.round(A*100)/100.0+" "+Math.round(B*100)/100.0+" "+Math.round(C*100)/100.0);
    }
}
