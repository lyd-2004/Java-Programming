import java.util.Scanner;
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter full year: ");
        int year=sc.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month=sc.nextInt();
        PrintCalendar(year,month);
        sc.close();
    }
    public static void PrintCalendar(int year,int month) {
        String[] find={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        String MONTH=Month(month);
        int DAY=Find_day(year, month);
        int i;
        System.out.println("        "+MONTH+'\t'+year);
        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        int[] every_month={31,28,31,30,31,30,31,31,30,31,30,31};
        if(((year%100!=0 && year%4==0) || year%400==0) && month==2) {
            if(find[DAY]=="Sat") {
                System.out.println("                           "+1);
            }else{
                for(int j=0;j<DAY;j++) {
                    System.out.print("    ");
                }
                System.out.print("   "+1);
            }
            for(i=2;i<=29;i++) {
                if(2<=i && i<=9) {
                    System.out.print("   "+i);
                }else{
                    System.out.print("  "+i);
                }
                if(find[(DAY+i-1)%7]=="Sat") {
                    System.out.println();
                }
            }
        }else{
            if(find[DAY]=="Sat") {
                System.out.println("                           "+1);
            }else{
                for(int j=0;j<DAY;j++) {
                    System.out.print("    ");
                }
                System.out.print("   "+1);
            }
            for(i=2;i<=every_month[month-1];i++) {
                if(2<=i && i<=9) {
                    System.out.print("   "+i);
                }else{
                    System.out.print("  "+i);
                }
                if(find[(DAY+i-1)%7]=="Sat") {
                    System.out.println();
                }
            }
        }
    }
    public static String Month(int month) {
        String[] arr={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String Month=arr[month-1];
        return Month;
    }
    public static int Find_day(int year,int month) {
        int[] every_month={31,28,31,30,31,30,31,31,30,31,30,31};
        int day,all_year=year-2012,more_day=0;
        int Day;
        if(month<3) {
            for(int i=month;i<3;i++) {
                more_day+=every_month[i-1];
            }
        }else{
            for(int i=3;i<month;i++) {
                more_day+=every_month[i-1];
            }
        }
        if((year<=2012 && month<3) || (year>=2012 && month>=3)) {
            day=Math.abs(all_year*365)+more_day;
        }else{
            day=Math.abs(all_year*365)-more_day;
        }
        if(year<=2012) {
            for(int i=year;i<=2012;i++) {
                if((i%100!=0 && i%4==0) || i%400==0) {
                    day++;
                }
            }
            if(((year%100!=0 && year%4==0) || year%400==0) && month>=3) {
                day--;
            }
        }else{
            for(int i=2013;i<=year;i++) {
                if((i%100!=0 && i%4==0) || i%400==0) {
                    day++;
                }
            }
            if(((year%100!=0 && year%4==0) || year%400==0) && month<3) {
                day--;
            }
        }
        day=day%7;
        if(year<2012 || year==2012 && month<3) {
            day=-day;
        }
        Day=(4+day+7)%7;
        return Day;
    }
}
