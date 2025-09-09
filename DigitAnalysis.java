import java.util.Scanner;

public class DigitAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        long tempNumber = Math.abs(number);
        
        while (tempNumber != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                System.arraycopy(digits, 0, tempArray, 0, digits.length);
                digits = tempArray;
            }
            
            digits[index] = (int)(tempNumber % 10);
            tempNumber /= 10;
            index++;
        }
        
        int largest = -1;
        int secondLargest = -1;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}