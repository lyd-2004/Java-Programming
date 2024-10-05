public class Financial_Compound {
    public static void main(String[] args) {
        String[] arr={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        double saving=100.0;
        double value=0;
        for(int i=0;i<arr.length;i++) {
            value=(value+saving)*(1+0.00417);
            System.out.println("After the "+arr[i]+" month,the value in the account becomes "+value);
        }
    }
}
