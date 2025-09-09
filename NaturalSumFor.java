import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            return;
        }
        
        // Using formula
        int formulaSum = n * (n + 1) / 2;
        
        // Using for loop
        int forSum = 0;
        for (int i = 1; i <= n; i++) {
            forSum += i;
        }
        
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + forSum);
        System.out.println("Results match: " + (formulaSum == forSum));
    }
}