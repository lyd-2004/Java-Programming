public class ReadCharFromConsole {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        String s=sc.nextLine();
        char ch=s.charAt(0);
        System.out.println("The character entered is: "+ch);
    }
}
