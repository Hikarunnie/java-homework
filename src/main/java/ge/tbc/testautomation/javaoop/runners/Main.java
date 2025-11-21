package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;
import java.util.Random;  // imma do it with importing Random, and imma keep randomized version as final

public class Main {
    public static void main(String[] args){
        Random rand = new Random();

        Circle c1 = new Circle(rand.nextDouble() * 44);
        System.out.println("num of instances: " + Circle.numberOfCircleInstances);
        Circle c2 = new Circle(rand.nextDouble() * 44);
        System.out.println("num of instances: " + Circle.numberOfCircleInstances);
        Circle c3 = new Circle(rand.nextDouble() * 44);
        System.out.println("num of instances: " + Circle.numberOfCircleInstances);
        Circle c4 = new Circle(rand.nextDouble() * 44);
        System.out.println("num of instances: " + Circle.numberOfCircleInstances);
        Circle c5 = new Circle(rand.nextDouble() * 44);
        System.out.println("num of instances: " + Circle.numberOfCircleInstances);

        String c1ToString= Util.circleToString(c1);
        System.out.println(c1ToString);

        String c2ToString= Util.circleToString(c2);
        System.out.println(c2ToString);

        String c3ToString= Util.circleToString(c3);
        System.out.println(c3ToString);

        String c4ToString= Util.circleToString(c4);
        System.out.println(c4ToString);

        String c5ToString= Util.circleToString(c5);
        System.out.println(c5ToString);

    }
}
