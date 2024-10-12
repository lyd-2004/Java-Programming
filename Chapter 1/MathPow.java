public class MathPow {
  public static void main(String[] args) {
    System.out.println("a"+"\t"+"a^2"+"\t"+"a^3");
    int[] arr={1,2,3};
    for(int i=0;i<arr.length;i++) {
      System.out.println(arr[i]+"\t"+(int)Math.pow(arr[i],2)+"\t"+(int)Math.pow(arr[i],3));
    }
  }
}
