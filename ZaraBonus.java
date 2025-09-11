import java.util.Random;

public class ZaraBonus {
    public static void main(String[] args) {
        double[][] salaryYears = getSalaryYears(10);
        double[][] newSalaryBonus = calculateNewSalaryBonus(salaryYears);
        displaySummary(salaryYears, newSalaryBonus);
    }

    public static double[][] getSalaryYears(int n) {
        double[][] arr = new double[n][2];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i][0] = 10000 + r.nextInt(90000);
            arr[i][1] = r.nextInt(11);
        }
        return arr;
    }

    public static double[][] calculateNewSalaryBonus(double[][] arr) {
        double[][] result = new double[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            double salary = arr[i][0];
            double years = arr[i][1];
            double bonusPercent = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displaySummary(double[][] oldArr, double[][] newArr) {
        double sumOldSalary = 0, sumNewSalary = 0, sumBonus = 0;
        System.out.printf("%-10s %-12s %-12s %-12s %-12s\n", "EmpID", "OldSalary", "Years", "Bonus", "NewSalary");
        for (int i = 0; i < oldArr.length; i++) {
            double oldSalary = oldArr[i][0];
            double years = oldArr[i][1];
            double bonus = newArr[i][1];
            double newSalary = newArr[i][0];
            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            sumBonus += bonus;
            System.out.printf("%-10d %-12.2f %-12.0f %-12.2f %-12.2f\n", i + 1, oldSalary, years, bonus, newSalary);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f\n", "Total", sumOldSalary, "", sumBonus, sumNewSalary);
    }
}
