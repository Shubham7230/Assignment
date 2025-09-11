import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();
        
        int[] result = findRemainderAndQuotient(chocolates, children);
        
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}