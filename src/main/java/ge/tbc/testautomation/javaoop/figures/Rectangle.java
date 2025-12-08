package ge.tbc.testautomation.javaoop.figures;
public class Rectangle extends Figure{
    private double a;
    private double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return a * b ;
    }
//// had to implement these methods to extend figure which we changed to abstract,
//// which I did to be able to pass Rectangle to FigurePair
    @Override
    public double getLength() {return a+b;}
    @Override
    public void printPackageName() {System.out.println(this.getClass().getPackage().getName());}
    public double getPerimeter(){
        return (a + b)*2;
    }
    @Override    // overrode so i could see if ReverseComparator worked properly
    public String toString() {
        return "Rectangle{width=" + a + ", height=" + b + "}";
    }
}