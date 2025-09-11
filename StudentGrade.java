import java.util.Random;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
    
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(51) + 50;
            scores[i][1] = random.nextInt(51) + 50;
            scores[i][2] = random.nextInt(51) + 50;
        }
        return scores;
    }
    
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i+1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "\t\t");
            System.out.println(getGrade(results[i][2]));
        }
    }
    
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }
}