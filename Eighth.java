// Write a Java program to demonstrate implicit and explicit type casting.
public class Eighth {
    public static void main(String[] args) {
        int intVal = 100;
        double doubleVal = intVal; 

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer Value: " + intVal);
        System.out.println("Converted to Double: " + doubleVal);
        double doubleNum = 99.99;
        int intNum = (int) doubleNum; 
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double Value: " + doubleNum);
        System.out.println("Converted to Integer: " + intNum);
    }
}
