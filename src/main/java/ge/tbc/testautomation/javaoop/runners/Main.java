package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnyPair<Field[],Field[]> ann =  getDeclaredFields(44,"Hikaru");

        System.out.println(Arrays.asList(ann.getElementOne()));
        System.out.println(Arrays.asList(ann.getElementTwo()));

        ////
        Circle c1 = new Circle(4.4);
        Rectangle r1 = new Rectangle(4,4);

        FigurePair<Circle,Rectangle> figPair = new FigurePair<>(c1,r1);
        System.out.println(figPair);
    }
    private static <K, D> AnyPair<Field[],Field[]> getDeclaredFields(K objOne, D objTwo){
        Field[] kFields = objOne.getClass().getDeclaredFields();
        Field[] dFields = objTwo.getClass().getDeclaredFields()     ;
        return new AnyPair<>(kFields,dFields);
    }
}
