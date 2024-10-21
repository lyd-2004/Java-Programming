public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime number are \n");
        printPrimeNumbers(50);
    }
    public static void printPrimeNumbers(int n) {
        int x=10;
        int cnt=0;
        int number=2;
        while(cnt<n){
            if(isprime(number)) {
                cnt++;
                if(cnt%x==0) {
                    System.out.printf("%-5d\n",number);
                }else{ 
                    System.out.printf("%-5d",number);
                }
            }
            number ++;
        }
    }
    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
