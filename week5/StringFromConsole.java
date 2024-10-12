public class StringFromConsole {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three words seperated by space:");
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        System.out.println("s1 is "+s1);
        System.out.println("s2 is "+s2);
        System.out.println("s3 is "+s3);
    }
}
