public class Calculate2 {
  public static void main(String[] args) {
    double sum=0,n=1;
    for(int i=1;i<=11;i+=2) {
        sum+=n/i;
        n=-n;
    }
    System.out.println(4*sum);
    double count=0;
    for(int i=1;i<=13;i+=2) {
      count+=n/i;
      n=-n;
    }
    System.out.println(4*count);
    }
  }
