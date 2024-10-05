import java.util.Scanner;
public class DisplayTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int seconds=sc.nextInt();
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        System.out.println(minutes);
        System.out.println(remainingSeconds);
    }
}
