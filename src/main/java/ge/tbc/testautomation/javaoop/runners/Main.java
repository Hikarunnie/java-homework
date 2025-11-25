package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
public class Main {
    public static void main(String[] args){
        // instantiated two rectangles to compare later and one triangle
        Rectangle rect1 = new Rectangle(Math.random() * 10, Math.random()*44); //with random values
        Rectangle rect2 = new Rectangle(Math.random()*44,Math.random()*10);
        Triangle trian = new Triangle(Math.random()*10,Math.random()*10,Math.random()*10);

        //I use all the function for each
        System.out.println("rectangle 1 area: " + rect1.getArea());
        System.out.println("rectangle 1 perimeter: " + rect1.getPerimeter());

        System.out.println("rectangle 2 area: " + rect2.getArea());
        System.out.println("rectangle 2 perimeter: " + rect2.getPerimeter());

        System.out.println("triangle area: " + trian.getArea());
        System.out.println("triangle perimeter: " + trian.getPerimeter());

        HelperFunctions.compareRectangles(rect1,rect2);
    }
}
