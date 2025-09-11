import java.util.Scanner;

public class TriangleRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side 1 of triangle (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter side 2 of triangle (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter side 3 of triangle (in meters): ");
        double side3 = scanner.nextDouble();
        
        int rounds = calculateRounds(side1, side2, side3);
        
        System.out.println("The athlete must complete " + rounds + " rounds to run 5km");
    }
    
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        return (int) Math.ceil(totalDistance / perimeter);
    }
}