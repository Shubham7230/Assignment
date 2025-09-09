import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            double height = -1;
            while (height <= 0) {
                System.out.print("Height (in meters): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            }
            
            double weight = -1;
            while (weight <= 0) {
                System.out.print("Weight (in kilograms): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            }
            
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height);
            
            double bmi = personData[i][2];
            
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nBMI Results:");
        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");
        System.out.println("---------------------------------------------");
        
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        
        scanner.close();
    }
}