import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int temp = Math.abs(number);
        int count = 0;
        
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        
        int[] digits = new int[count];
        temp = Math.abs(number);
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        int[] frequency = new int[10];
        
        for (int digit : digits) {
            frequency[digit]++;
        }
        
        System.out.println("Digit Frequency in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        
        scanner.close();
    }
}