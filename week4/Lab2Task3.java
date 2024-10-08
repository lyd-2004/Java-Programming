public class Lab2Task3 {
    public static void main(String[] args) {
        String[] arr={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int index=1;
        int days=100;
        int i=(days%7+index)%7;
        System.out.println("If today is Tuesday,it will be "+arr[i]+" in 100 days.");
    }
}
