// Write a Java program to demonstrate the use of a static final variable (constant).
public class Sixtinth {
    static final double PI = 3.14159;
    public static void main(String[] args) {
        double radius = 7.0;
        double area = PI * radius * radius;
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Value of Constant PI: " + PI);
        System.out.println("Area of Circle: " + area);
    }
}
