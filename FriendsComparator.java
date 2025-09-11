import java.util.Scanner;

public class FriendsComparator {
    
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngest = names[0];
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }
    
    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = heights[0];
        String tallest = names[0];
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("Enter age and height for 3 friends:");
        
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + "'s age: ");
            ages[i] = scanner.nextInt();
            System.out.print(names[i] + "'s height (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);
        
        System.out.println("\nYoungest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
        
        scanner.close();
    }
}