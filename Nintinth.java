// Write a Java program to check if a long value can be stored in a float variable and display the result.
public class Nintinth {
    public static void main(String[] args) {
        long longValue = 9223372036854775807L; 
        float floatValue = longValue;          
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value after conversion: " + floatValue);
        
        if (longValue == (long) floatValue) {
            System.out.println("The long value can be stored in a float without loss of precision.");
        } else {
            System.out.println("The long value cannot be stored in a float accurately (loss of precision).");
        }
    }
}
