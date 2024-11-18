import java.util.Random;
public class randomShuffle {
    public static void main(String[] args) {
        int[][] m={{1,2},{3,4},{5,6},{7,8},{9,10}};
        shuffle(m);
        System.out.println("The shuffled array is: ");
        for(int i=0;i<5;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void shuffle(int[][] m) {
        int index1,index2;
        int[] arr=new int[2];
        Random sc=new Random();
        int time=sc.nextInt(5)+1;
        for(int i=0;i<=time;i++) {
            index1=sc.nextInt(5);
            index2=sc.nextInt(5);
            arr=m[index1];
            m[index1]=m[index2];
            m[index2]=arr;
        }
    }
}
