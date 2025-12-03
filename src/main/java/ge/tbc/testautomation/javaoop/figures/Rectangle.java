package ge.tbc.testautomation.javaoop.figures;
public class Rectangle{
    private double a;
    private double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return a * b ;
    }
    public double getPerimeter(){
        return (a + b)*2;
    }
    @Override    // overrode so i could see if ReverseComparator worked properly
    public String toString() {
        return "Rectangle["+ "area=" + getArea() + "]";
    }
}