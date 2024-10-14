import java.util.Scanner;
public class Palinderome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string=sc.next();
        String string1="";
        for(int i=string.length()-1;i>=0;i--) {
            string1+=string.charAt(i);
        }
        if(string.equals(string1)) {
            System.out.println(string+" is a palindrome");
        }else{
            System.out.println(string+" is not a palindrome");
        }
    }
}
