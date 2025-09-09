import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int largest = num1;
        if (num2 > largest && num2 > num3) {
            largest = num2;
        } else if (num3 > largest && num3 > num2) {
            largest = num3;
        }
        
        System.out.println("Largest number: " + largest);
        scanner.close();
    }
}