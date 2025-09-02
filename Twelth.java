// Write a Java program to demonstrate type promotion in arithmetic operations.
public class Twelth {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        int sum = b1 + b2;
        System.out.println("byte + byte promoted to int: " + sum);

        char ch = 'A'; 
        int result = ch + 5; 
        System.out.println("char + int promoted to int: " + result);
        int i = 100;
        long l = 200L;
        long longResult = i + l;
        System.out.println("int + long promoted to long: " + longResult);
        float f = 10.5f;
        float floatResult = l + f;
        System.out.println("long + float promoted to float: " + floatResult);
        double d = 55.5;
        double doubleResult = f + d;
        System.out.println("float + double promoted to double: " + doubleResult);
    }
}
