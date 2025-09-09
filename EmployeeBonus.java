import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--;
                continue;
            }
            
            System.out.print("Enter years of service: ");
            int years = scanner.nextInt();
            if (years < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--;
                continue;
            }
            
            salaries[i] = salary;
            yearsOfService[i] = years;
            totalOldSalary += salary;
        }
        
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
        
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}