//Write a program to swap two numbers using a third variable .
public class Third {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before Swapping:");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\nAfter Swapping:");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
    }
}
