package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        // negative val
        try {
            Circle c1 = new Circle(-4.4);
        }catch(RadiusException re){
            System.out.println(re.getMessage());
        }
        // testing limit
        try{
            for(int i=1; i<8; i++){
                System.out.println("creating circle " + i);
                Circle circle = new Circle(Math.random()*44);
            }
        }catch(LimitException le){
            System.out.println(le.getMessage());
        }

       // string ops
        String stri = "Test Automation Bootcamp 12, 2025";

        //indexes put by hand
        String autom1 = stri.substring(5,15).toLowerCase();

        //second version using indexof()
        int endIndex = stri.indexOf("Automation") + "Automation".length();
        String withIndexOf = stri.substring(stri.indexOf("Automation"),endIndex ).toLowerCase();

        System.out.println(autom1);
        System.out.println(withIndexOf);

        String[] words = stri.split(" ");
        for(String w : words) {
            System.out.println(w);
        }

        System.out.println("length: " + stri.length());

        String replaced = stri.replaceAll(" ", "-");
        System.out.println(replaced);

        //regex
        String[] numbers = {"555-74-24-75","444-44-44-44","598-003-987","555-26-08-44","5744-44-48-44","599-987-654"};
        for(String number : numbers){
            System.out.println(phoneNumberValidation(number));
        }

    }
    private static boolean phoneNumberValidation(String phoneNumber){
        String finalNum = phoneNumber.replaceAll("-","");

        Pattern pattern = Pattern.compile("(555|595|592|599)\\d{6}");
        Matcher matcher = pattern.matcher(finalNum);

        return matcher.matches();
    }

}
