import java.util.Scanner;

public class NumberAnalyzer {
    
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + numbers[i] + ": ");
            
            if (isPositive(numbers[i])) {
                System.out.print("Positive, ");
                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }
        
        // Compare first and last elements
        int comparison = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first (" + numbers[0] + 
                        ") and last (" + numbers[4] + ") elements: ");
        
        if (comparison == 1) {
            System.out.println("First is greater than last");
        } else if (comparison == -1) {
            System.out.println("First is less than last");
        } else {
            System.out.println("First and last are equal");
        }
        
        scanner.close();
    }
}