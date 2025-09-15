import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println(num);
    }

    public static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        handleException(input);
    }
}
