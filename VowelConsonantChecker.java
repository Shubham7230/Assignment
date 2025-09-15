import java.util.Scanner;

public class VowelConsonantChecker {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + ('a' - 'A'));
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] findVowelsConsonants(String input) {
        int length = input.length();
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = Character.toString(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s | %-15s\n", "Character", "Type");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s | %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] result = findVowelsConsonants(input);
        displayTable(result);
        scanner.close();
    }
}
