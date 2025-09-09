import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        double square = num * num;
        double cube = num * num * num;
        
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        scanner.close();
    }
}