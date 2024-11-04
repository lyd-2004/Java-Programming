public class Circle {
    double radius;
    static int numberOfObjects=0;
    public Circle2(int r) {
        radius=r;
        numberOfObjects++;
    }
    public Circle2() {
        radius=1;
        numberOfObjects++;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
