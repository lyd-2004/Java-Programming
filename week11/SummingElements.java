public class SummingElements {
    public static void main(String[] args) {
        int [][] matrix=new int [3][3];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                matrix[i][j]=(int)(Math.random()*20);
            }
        }
        int total=0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                total+=matrix[i][j];
            }
        }
        System.out.println("The total is "+total);
    }
}
