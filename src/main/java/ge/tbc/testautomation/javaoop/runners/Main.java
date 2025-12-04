package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.annotationsAndStreams.Analyzable;
import ge.tbc.testautomation.annotationsAndStreams.VariableNameAnnotation;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Field[] fields = Analyzable.class.getDeclaredFields();

        ////matching names
        List<Field> matchName = Arrays.stream(fields).filter(field ->{
            if(field.isAnnotationPresent(VariableNameAnnotation.class)){
                VariableNameAnnotation anotName = field.getAnnotation(VariableNameAnnotation.class);
                return anotName.name().toLowerCase().equals(field.getName()); //without lowerCase none satisfies(Ispokemon != ispokemon)
              //return anotName.name().equalsIgnoreCase(field.getName()); //this does the rtick as well
            }
            return false;
        }).toList();

        for(Field fil : matchName){
            System.out.println(fil);
        }

        ////ones that don't match
        List<Field> misMatchName = Arrays.stream(fields).filter(field -> {
            if(field.isAnnotationPresent(VariableNameAnnotation.class)){
                VariableNameAnnotation anotName = field.getAnnotation(VariableNameAnnotation.class);
                return !anotName.name().toLowerCase().equals(field.getName());
            }
            return false;
        }).toList();

        System.out.println("doesn't match: " + misMatchName); //pokemon and num2

       /////directly put SuppressWarnings above each variable not above main coz assignment didn't specify(?)
       @SuppressWarnings("unused")
       String nam ="Hikaru";

       @SuppressWarnings("unused")
       int num = 44;

       @SuppressWarnings("unused")
       Boolean isNice = true;

       @SuppressWarnings("unused")
       String pok ="Umbreon & Sylveon";

    }
}
