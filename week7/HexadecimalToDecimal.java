import java.util.Scanner;
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个十六进制数: ");
        String string=sc.next();
        int Dec=ToDecimal(string);
        if(Dec==-1) {
            System.out.println("输入有误，请重新输入");
        }else{
            System.out.println("The hexadecimal number "+string+" is decimal number "+Dec);
        }
    }
    public static int ToDecimal(String string) {
        int number;
        int dec=0;
        for(int i=0;i<string.length();i++) {
            if('0'<=string.charAt(i) && string.charAt(i)<='9') {
                number=(int)(string.charAt(i))-48;
            }else if('A'<=string.charAt(i) && string.charAt(i)<='F') {
                number=(int)(string.charAt(i))-55; 
            }else if('a'<=string.charAt(i) && string.charAt(i)<='f') {
                number=(int)(string.charAt(i))-87;
            }else{
                return -1;
            }
            dec+=number*Math.pow(10,(string.length()-i-1));
        }
        return dec;
    }
}
