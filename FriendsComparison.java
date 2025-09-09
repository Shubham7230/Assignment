import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height (cm): ");
        double amarHeight = scanner.nextDouble();
        
        // Input for Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height (cm): ");
        double akbarHeight = scanner.nextDouble();
        
        // Input for Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height (cm): ");
        double anthonyHeight = scanner.nextDouble();
        
        // Find youngest
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngest = "";
        
        if (amarAge == youngestAge) youngest = "Amar";
        if (akbarAge == youngestAge) youngest = "Akbar";
        if (anthonyAge == youngestAge) youngest = "Anthony";
        
        // Find tallest
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallest = "";
        
        if (amarHeight == tallestHeight) tallest = "Amar";
        if (akbarHeight == tallestHeight) tallest = "Akbar";
        if (anthonyHeight == tallestHeight) tallest = "Anthony";
        
        System.out.println("Youngest friend: " + youngest + " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallest + " (Height: " + tallestHeight + " cm)");
    }
}