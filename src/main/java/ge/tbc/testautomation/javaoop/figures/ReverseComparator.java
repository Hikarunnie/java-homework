package ge.tbc.testautomation.javaoop.figures;
import java.util.Comparator;
public class ReverseComparator implements Comparator<Rectangle> {
    public int compare(Rectangle re1, Rectangle re2) {
        double area1 = re1.getArea();
        double area2 = re2.getArea();
        return -Double.compare(area1, area2);
    }
}
