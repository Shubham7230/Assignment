import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        
        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();
        
        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516; // 1 sq inch = 6.4516 sq cm
        
        System.out.println("The area of triangle is " + areaSqInches + 
                          " square inches and " + areaSqCm + " square centimeters");
    }
}