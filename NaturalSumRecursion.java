import java.util.Scanner;

public class NaturalSumRecursion {
    
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            System.exit(0);
        }
        
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);
        
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal!");
        } else {
            System.out.println("Results don't match. There might be an error.");
        }
        
        scanner.close();
    }
}