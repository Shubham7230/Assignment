import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = checkNumber(number);
        
        if (result == -1) {
            System.out.println("Negative number");
        } else if (result == 1) {
            System.out.println("Positive number");
        } else {
            System.out.println("Zero");
        }
    }
    
    public static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}