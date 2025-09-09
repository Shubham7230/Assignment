import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        String result = (num % 3 == 0 && num % 5 == 0) ? 
                       "Divisible by both 3 and 5" : 
                       "Not divisible by both 3 and 5";
        
        System.out.println(result);
        scanner.close();
    }
}