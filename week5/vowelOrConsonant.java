import java.util.Scanner;
public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String Ch=sc.next();
        char ch=Ch.charAt(0);
        if(65<=(int)ch && (int)ch<=90) {
            System.out.println(ch+" is a Consonant");
        }else if(97<=(int)ch && (int)ch<=122) {
            System.out.println(ch+" is a vowel");
        }else{
            System.out.println(ch+" is an invalid input");
        }
    }
}
