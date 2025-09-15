import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    static String[] names;

    public static void generateException() {
        String name = names[names.length]; 
        System.out.println(name);
    }

    public static void handleException() {
        try {
            String name = names[names.length];
            System.out.println(name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names:");
        int n = sc.nextInt();
        sc.nextLine();
        names = new String[n];
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        handleException();
        sc.close();
    }
}
