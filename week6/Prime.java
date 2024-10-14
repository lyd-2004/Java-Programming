public class Prime {
    public static void main(String[] args) {
        int i=2,count=1;
        System.out.println("The first 50 prime numbers are");
        System.out.print(2+" ");
        while(count<50) {
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i)+1;j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i+" ");
                count++;
            }
            if(count%10==0 && flag) {
                System.out.println();
            }
            i++;
        }
    }
}
