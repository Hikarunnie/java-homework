package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
public class Main {
    public static void main(String[] args) {
        //// for invalid
        try {
            Circle invalidCircle = new Circle(-4.4);
        }catch(RadiusException re){
            System.out.println(re.getMessage());
        }
        try{
           //// using methods for valid circle
            Circle c1 = new Circle(4);
            System.out.println("area:" + c1.getArea());
            System.out.println("length: " + c1.getLength());
            c1.printPackageName();

            c1.doubleSize();
            System.out.println("size after doubling:" + c1.getLength());
            c1.customSize(4);
            System.out.println("size after custom sizing:" + c1.getLength());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //// trying stuff for triangle
        try {
            Triangle invalidTriangle = new Triangle(-4.4, 4, 0);
        }catch(RadiusException re){
            System.out.println(re.getMessage());
        }

        try{
            Triangle tri1 = new Triangle(4,4,4);
            System.out.println("tri1 area:" + tri1.getArea());
            System.out.println("tri1 length: " + tri1.getLength());
            tri1.printPackageName();

            tri1.doubleSize();
            System.out.println("size after doubling:" + tri1.getLength());
            tri1.customSize(4);
            System.out.println("size after custom sizing:" + tri1.getLength());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }




        try{
            Triangle tri2 = new Triangle(4,4,4);
            tri2.customSize(0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
