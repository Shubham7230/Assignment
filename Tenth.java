// Write a Java program to find the area of a circle using a final variable for PI.
public class Tenth {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}
