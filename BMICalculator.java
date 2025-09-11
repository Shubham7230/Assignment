import java.util.Scanner;

public class BMICalculator {
    
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert cm to meters
        return weight / (heightM * heightM);
    }
    
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][4]; // [weight, height, bmi, status]
        
        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
            
            // Calculate BMI
            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]);
        }
        
        System.out.println("\nBMI Results:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("--------------------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            String status = getBMIStatus(teamData[i][2]);
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                            i + 1, teamData[i][0], teamData[i][1], 
                            teamData[i][2], status);
        }
        
        scanner.close();
    }
}