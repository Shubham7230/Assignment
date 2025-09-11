import java.util.Scanner;

public class ExtendedUnitConverter {
    
    // Additional conversion methods
    public static double convertCmToInches(double cm) {
        return cm / 2.54;
    }
    
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
    
    public static double convertKgToGrams(double kg) {
        return kg * 1000;
    }
    
    public static double convertGramsToKg(double grams) {
        return grams / 1000;
    }
    
    public static double convertHoursToMinutes(double hours) {
        return hours * 60;
    }
    
    public static double convertMinutesToHours(double minutes) {
        return minutes / 60;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Extended Unit Converter");
        System.out.println("1. cm to inches");
        System.out.println("2. inches to cm");
        System.out.println("3. kg to grams");
        System.out.println("4. grams to kg");
        System.out.println("5. hours to minutes");
        System.out.println("6. minutes to hours");
        
        System.out.print("Choose conversion type (1-6): ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();
        
        double result = 0;
        String conversion = "";
        
        switch (choice) {
            case 1:
                result = convertCmToInches(value);
                conversion = value + " cm = " + result + " inches";
                break;
            case 2:
                result = convertInchesToCm(value);
                conversion = value + " inches = " + result + " cm";
                break;
            case 3:
                result = convertKgToGrams(value);
                conversion = value + " kg = " + result + " grams";
                break;
            case 4:
                result = convertGramsToKg(value);
                conversion = value + " grams = " + result + " kg";
                break;
            case 5:
                result = convertHoursToMinutes(value);
                conversion = value + " hours = " + result + " minutes";
                break;
            case 6:
                result = convertMinutesToHours(value);
                conversion = value + " minutes = " + result + " hours";
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        System.out.println(conversion);
        scanner.close();
    }
}