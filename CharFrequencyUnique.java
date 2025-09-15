import java.util.Scanner;

public class CharFrequencyUnique {
    public static char[] uniqueChars(String text) {
        char[] unique = new char[text.length()];
        int count = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[count++] = current;
            }
        }
        
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }
        return result;
    }
    
    public static String[][] charFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        
        char[] unique = uniqueChars(text);
        String[][] result = new String[unique.length][2];
        
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[][] freq = charFrequency(text);
        for (String[] row : freq) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }
}