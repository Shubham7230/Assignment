import java.util.Scanner;

public class TriangleArea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base in cm: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();
        
        double areaCm = 0.5 * base * height;
        double baseIn = base / 2.54;
        double heightIn = height / 2.54;
        double areaIn = 0.5 * baseIn * heightIn;
        
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn, areaCm);
    }
}