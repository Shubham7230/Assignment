import java.util.Scanner;

public class StringToCharArrayComparison {
    public static char[] toCharArrayCustom(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] arr1 = toCharArrayCustom(text);
        char[] arr2 = text.toCharArray();

        System.out.println("Arrays are equal: " + compareCharArrays(arr1, arr2));
    }
}
