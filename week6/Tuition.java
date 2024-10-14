public class Tuition {
    public static void main(String[] args) {
        double tuition=10000;
        double i=0;
        int count=0;
        for(i=10000;i<tuition*2;) {
            i=i*1.07;
            count++;
        }
        i=Math.round(i*100.0)/100.0;
        System.out.println("Tuition will be doubled in "+count+" years");
        System.out.println("Tuition will be $"+i+" in "+count+" years");
    }
}
