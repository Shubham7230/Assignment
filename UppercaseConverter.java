import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text to convert to uppercase: ");
        String text = scanner.nextLine();
        
        String customUpper = convertToUppercase(text);
        String builtinUpper = text.toUpperCase();
        
        boolean match = compareStrings(customUpper, builtinUpper);
        
        System.out.println("Custom conversion: " + customUpper);
        System.out.println("Built-in conversion: " + builtinUpper);
        System.out.println("Strings match: " + match);
        
        scanner.close();
    }
    
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            result.append(c);
        }
        return result.toString();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}