package ge.tbc.testautomation.javaoop.figures;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
public class Circle extends Figure implements IResizable, IValidFigure, Comparable {
private double radius;
public Circle(double radius) {
    this.radius = radius;
    if(!validateFigure()){ //replaced previous hw's radius<=0
        throw new RadiusException("RADIUS VALUE NOT VALID");  //reued RadiusException from previous hw
    }
}
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2) ;
    }
    @Override
    public double getLength(){
    return 2 * Math.PI * radius;
    }
    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    ////interface methods
    @Override
    public void doubleSize() {
        this.radius *=2;
    }
    @Override
    public void customSize(double byValue) {
        if (byValue <= 0) {   //making sure it won't be nagative or 0
            throw new IllegalArgumentException("Custom multiplier must be positive");
        }
        this.radius *= byValue;
    }
    @Override
    public boolean validateFigure() {
        return radius>0;
    }

    ////getter/setters
    public double getRadius() {
      return radius;
    }
    public void setRadius(double radius) {
      if (radius <= 0) {
        throw new RadiusException("RADIUS VALUE NOT VALID");
    }
      this.radius = radius;
    }

    @Override
    public int compareTo(Object o) {
      Circle other = (Circle) o;
      if(this.radius > other.radius){
          return 1;
      }else if (this.radius < other.radius){
          return -1;
      }else{
          return 0;
      }
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}


