public class areaAndPerimeter {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter the width and height of the rectangle");
    double input1=input.nextDouble();
    double input2=input.nextDouble();
    double area=0,Perimeter=0;
    area=input1*input2;
    Perimeter=input1+input2;
    System.out.println(area);
    System.out.println(2*Perimeter);
    input.close();
  }
}
