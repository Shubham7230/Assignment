// Write a Java program to use wrapper class methods to convert numbers to binary and hexadecimal.
public class Fourtinth {
    public static void main(String[] args) {
        int number = 100;
        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        System.out.println("Number: " + number);
        System.out.println("Binary Representation: " + binary);
        System.out.println("Hexadecimal Representation: " + hex);
    }
}
