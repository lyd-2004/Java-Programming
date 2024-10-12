public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two cities and displays them in alphabetical order");
        String city1=sc.next();
        String city2=sc.next();
        if(city1.compareTo(city2)<0){
            System.out.println("The alphabetical order is :"+city1+" "+city2);
        }else{
            System.out.println("The alphabetical order is :"+city2+" "+city1);
    }
}
