import java.util.Scanner;

public class TrimStringUsingCharAt {

    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedUsingCharAt = "";
        if (indices[0] <= indices[1]) {
            trimmedUsingCharAt = substringUsingCharAt(input, indices[0], indices[1]);
        }

        String trimmedUsingBuiltIn = input.trim();

        System.out.println("Trimmed using charAt method: '" + trimmedUsingCharAt + "'");
        System.out.println("Trimmed using built-in trim(): '" + trimmedUsingBuiltIn + "'");

        boolean isEqual = compareStrings(trimmedUsingCharAt, trimmedUsingBuiltIn);
        System.out.println("Are both trimmed strings equal? " + isEqual);

        sc.close();
    }
}
