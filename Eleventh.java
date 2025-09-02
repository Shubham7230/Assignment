// Write a Java program to show the difference between char and String data types.
public class Eleventh {
    public static void main(String[] args) {
        char ch = 'A';
        String str = "Hello";
        System.out.println("---- Difference between char and String ----");
        System.out.println("char example: " + ch);
        System.out.println("String example: " + str);
        System.out.println("\nLength of char: Always 1");
        System.out.println("Length of String \"" + str + "\": " + str.length());
        System.out.println("\nchar can be used in arithmetic operations:");
        System.out.println("ch + 1 = " + (ch + 1)); 
        System.out.println("\nString is used for text operations:");
        System.out.println("Concatenation: " + str + " World");
    }
}
