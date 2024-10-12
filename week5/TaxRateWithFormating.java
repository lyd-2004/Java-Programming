public class TaxRateWithFormating {
    public static void main(String[] args) {
        double amount=12618.98;
        double interestRate=0.0013;
        double interst=amount*interestRate;
        System.out.println("Interest is $"+interst);
        System.out.printf("Interest with two decimal point is $%4.2f",interst);
    }

}
