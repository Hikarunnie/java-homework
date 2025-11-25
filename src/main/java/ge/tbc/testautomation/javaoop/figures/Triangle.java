package ge.tbc.testautomation.javaoop.figures;
public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h = 4.4; // since hw said I could write h by hand, I'll just set it to 4.4
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea(){
        return (a * h) / 2;
    }
    @Override
    public double getPerimeter(){
        return a + b + c;
    }
}
