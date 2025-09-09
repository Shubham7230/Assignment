import java.util.Scanner;

public class NaturalSumWhile {
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
        
        // Using while loop
        int whileSum = 0;
        int i = 1;
        while (i <= n) {
            whileSum += i;
            i++;
        }
        
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + whileSum);
        System.out.println("Results match: " + (formulaSum == whileSum));
    }
}