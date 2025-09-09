import java.util.Scanner;

public class OddEvenNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
            return;
        }
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}