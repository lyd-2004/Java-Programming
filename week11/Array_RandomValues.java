public class Array_RandomValues {
    public static void main(String[] args) {
        int [][] a=new int [3][3];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[0].length;j++) {
                a[i][j]=(int)(Math.random()*20);
            }
        }
        System.out.println(a[0][0]);
    }
}
