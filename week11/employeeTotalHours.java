public class employeeTotalHours {
    public static void main(String[] args) {
        int[][] arr={{2,4,3,4,5,8,8},
        {7,3,4,3,3,4,4},
        {3,3,4,3,3,2,2},
        {9,3,4,7,3,4,1},
        {3,5,4,3,6,3,8},
        {3,4,4,6,3,4,4},
        {3,7,4,8,3,8,4},
        {6,3,5,9,2,7,9}};
        int[] time=new int[8];
        int[] index={0,1,2,3,4,5,6,7};
        int a;
        for(int i=0;i<arr.length;i++) {
            time[i]=sum_arr(arr[i]);
        }
        for(int i=0;i<time.length-1;i++) {
            for(int j=i+1;j<time.length;j++) {
                if(time[i]<time[j]) {
                    a=time[i];
                    time[i]=time[j];
                    time[j]=a;
                    a=index[i];
                    index[i]=index[j];
                    index[j]=a;
                }
            }
        }
        for(int i=0;i<time.length;i++) {
            System.out.println("Employee"+index[i]+"'s total hours this week is "+time[i]);
        }
    }
    public static int sum_arr(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
