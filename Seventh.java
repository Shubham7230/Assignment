// Write a Java program to print default values of instance variables in a class.
public class Seventh {
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    String stringVar;  

    public static void main(String[] args) {
        Seventh obj = new Seventh();
        System.out.println("Default value of byte: " + obj.byteVar);
        System.out.println("Default value of short: " + obj.shortVar);
        System.out.println("Default value of int: " + obj.intVar);
        System.out.println("Default value of long: " + obj.longVar);
        System.out.println("Default value of float: " + obj.floatVar);
        System.out.println("Default value of double: " + obj.doubleVar);
        System.out.println("Default value of char: '" + obj.charVar + "'");
        System.out.println("Default value of boolean: " + obj.booleanVar);
        System.out.println("Default value of String (reference type): " + obj.stringVar);
    }
}
