import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        int customLength = findStringLength(input);
        int builtinLength = input.length();
        
        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtinLength);
        
        scanner.close();
    }
    
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}