public class largestRowAndColumn {
    public static void main(String[] args) {
        int[][] arr=new int[4][4];
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                arr[i][j]=(int)(Math.random()*2);
            }
        }
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int[] rowSum=new int[4];
        int[] columnSum=new int[4];
        for(int i=0;i<4;i++) {
            rowSum[i]=sumRow(arr,i);
            columnSum[i]=sumColumn(arr, i);
        }
        int maxRowIndex=0;
        int maxColumnIndex=0;
        for(int i=1;i<4;i++) {
            if(rowSum[i]>rowSum[maxRowIndex]) {
                maxRowIndex=i;
            }
            if(columnSum[i]>columnSum[maxColumnIndex]) {
                maxColumnIndex=i;
            }
        }
        System.out.println("The largest row index: "+maxRowIndex);
        System.out.println("The largest column index: "+maxColumnIndex);
    }
    public static int sumRow(int[][] arr,int rowIndex) {
        int sum=0;
        for(int j=0;j<4;j++) {
            sum+=arr[rowIndex][j];
        }
        return sum;
    }
    public static int sumColumn(int[][] arr,int columnIndex) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i][columnIndex];
        }
        return sum;
    }
}
