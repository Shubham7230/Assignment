import java.util.Scanner;

public class ToLowerCaseCompare {
    public static String toLowerCaseCustom(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String lowerCustom = toLowerCaseCustom(input);
        String lowerBuiltIn = input.toLowerCase();
        boolean result = compareStrings(lowerCustom, lowerBuiltIn);
        System.out.println("Custom toLowerCase equals built-in: " + result);
        sc.close();
    }
}
