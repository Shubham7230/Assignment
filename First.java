// Write a Java program to declare and print all primitive data types.
public class First {
    public static void main(String[] args) {
        // 1. byte (1 byte, range: -128 to 127)
        byte byteVar = 100;

        // 2. short (2 bytes, range: -32,768 to 32,767)
        short shortVar = 10000;

        // 3. int (4 bytes, range: -2^31 to 2^31-1)
        int intVar = 100000;

        // 4. long (8 bytes, needs 'L' at end for large values)
        long longVar = 10000000000L;

        // 5. float (4 bytes, needs 'f' at end)
        float floatVar = 10.5f;

        // 6. double (8 bytes, default decimal type)
        double doubleVar = 20.99;

        // 7. char (2 bytes, stores a single character)
        char charVar = 'A';

        // 8. boolean (1 bit, values: true/false)
        boolean booleanVar = true;

        // Printing all values
        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Int Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Char Value: " + charVar);
        System.out.println("Boolean Value: " + booleanVar);
    }
}
