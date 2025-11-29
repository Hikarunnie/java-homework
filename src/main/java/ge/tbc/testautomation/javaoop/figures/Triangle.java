package ge.tbc.testautomation.javaoop.figures;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
public class Triangle extends Figure implements IResizable, IValidFigure {
    private double a;
    private double b;
    private double c;
    private double h = 4.4; // since hw said I could write h by hand, I'll just set it to 4.4
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if(!validateFigure()){
            throw new RadiusException("INVALID TRIANGLE SIDE VALUES");
        }
    }
    @Override
    public double getArea(){
        return (a * h) / 2;
    }
    @Override
    public double getLength() {
        return a + b + c;
    }
    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    ////////interface methods
    @Override
    public void doubleSize() {
        a*=2;
        b*=2;
        c*=2;
        h*=2;
    }
    @Override
    public void customSize(double byValue) {
        if (byValue <= 0) {
            throw new IllegalArgumentException("Custom multiplier must be positive");
        }
        a*=byValue;
        b*=byValue;
        c*=byValue;
        h*=byValue;
    }
    @Override
    public boolean validateFigure() {
        //side value positivity + I'll add triangle inequality - sum of 2 sides must be greater than 3rd side
        return (a>0 && b>0 && c>0) && (a + b > c && a + c > b && b + c > a) ;
    }
}
