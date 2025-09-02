// Write a Java program to demonstrate numeric overflow in Java.
public class Eightinth {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE; 
        System.out.println("Maximum int value: " + max);
        int overflow = max + 1; 
        System.out.println("After adding 1 (overflow): " + overflow);
        byte b = 127; 
        System.out.println("\nMaximum byte value: " + b);
        b++; 
        System.out.println("After incrementing (overflow): " + b);
    }
}
