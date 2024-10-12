public class Math2 {
    public static void main(String[] args) {
        System.out.println("The value of max(2,3): "+Math.max(2,3));
        System.out.println("The value of min(2.5,4.6)"+Math.min(2.5,4.6));
        System.out.println("The value of max(max(2.5,4.6),min(3,5.6)): "+Math.max(Math.max(2.5,4.6),Math.min(3,5.6)));
        System.out.println("The value of abs(-2): "+Math.abs(-2));
        System.out.println("The value of abs(-2.1): "+Math.abs(-2.1));
    }
}
