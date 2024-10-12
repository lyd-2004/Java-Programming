import java.util.Scanner;
import java.util.ArrayList;
public class cityOrder {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1=sc.next();
        System.out.println();
        System.out.print("Enter the second city: ");
        String city2=sc.next();
        System.out.println();
        System.out.print("Enter the third city: ");
        String city3=sc.next();
        System.out.println();
        list.add(city1);
        list.add(city2);
        list.add(city3);
        String City=Compare_cityName(Compare_cityName(city1,city2,true),city3,true);
        String city=Compare_cityName(Compare_cityName(city1,city2,false),city3,false);
        list.remove(City);
        list.remove(city);
        StringBuilder remainCity=new StringBuilder();
        remainCity.append(list.get(0));
        remainCity.toString();
        System.out.println("The three cities in alphabetical order are "+city+" "+remainCity+" "+City);
    }
    public static String Compare_cityName(String city1,String city2,boolean flag) {
        int num1=city1.length();
        int num2=city2.length();
        int num=num1<num2?num1:num2;
        for(int i=0;i<num;i++) {
            if((city1.charAt(i)>city2.charAt(i) && flag) || city1.charAt(i)<city2.charAt(i) && !flag) {
                return city1;
            }else if((city1.charAt(i)<city2.charAt(i) && flag) || (city1.charAt(i)>city2.charAt(i) && !flag)) {
                return city2;
            }
        }
        if(flag) {
            return num1>num2?city1:city2;
        }else{
            return num1>num2?city2:city1;
        }
    }
}
