import java.util.Scanner;

public class CharFrequencyNested {
    public static String[] charFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (chars[i] != '0') count++;
        }
        
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + ": " + freq[i];
                index++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[] freq = charFrequency(text);
        for (String s : freq) {
            System.out.println(s);
        }
    }
}