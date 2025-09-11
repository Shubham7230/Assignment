import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x1 y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2 y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        System.out.print("Enter x3 y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        
        boolean bySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean byArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        
        System.out.println("Collinear by slope method: " + bySlope);
        System.out.println("Collinear by area method: " + byArea);
    }
    
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        return Math.abs(slopeAB - slopeBC) < 1e-10 && Math.abs(slopeBC - slopeAC) < 1e-10;
    }
    
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-10;
    }
}