package ge.tbc.testautomation.annotationsAndStreams;

public class Analyzable{
    @VariableNameAnnotation(name = "Num")
    private int num;

    @VariableNameAnnotation(name = "Height")
    private double height;

    @VariableNameAnnotation                      ////without name
    private String pokemon;

    @VariableNameAnnotation(name = "Ispokemon")
    private boolean ispokemon;

    @VariableNameAnnotation(name = "Numberrrr")   ////different name
    private float num2;

    @VariableNameAnnotation(name = "Email")
    private String email;

    @VariableNameAnnotation(name = "Isoldd")
    private boolean isoldd;

    @VariableNameAnnotation(name = "Balance")
    private long balance;

    @VariableNameAnnotation(name = "Charr")
    private char charr;

    @VariableNameAnnotation(name = "Num3")
    private short num3;

}
