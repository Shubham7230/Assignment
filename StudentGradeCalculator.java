import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculator {
    
    public static int[][] generatePCMscores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60;
            scores[i][1] = random.nextInt(41) + 60;
            scores[i][2] = random.nextInt(41) + 60;
        }
        
        return scores;
    }
    
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = average;
            
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return results;
    }
    
    public static String[][] calculateGrades(double[][] results) {
        int numStudents = results.length;
        String[][] grades = new String[numStudents][2];
        
        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];
            
            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial standards";
            }
        }
        
        return grades;
    }
    
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        int numStudents = scores.length;
        
        System.out.println("\n" + "=".repeat(120));
        System.out.println("STUDENT SCORECARD - PHYSICS, CHEMISTRY, MATHS (PCM)");
        System.out.println("=".repeat(120));
        System.out.printf("%-8s %-10s %-12s %-10s %-10s %-10s %-12s %-10s %-25s%n",
                         "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade", "Remarks");
        System.out.println("-".repeat(120));
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-8d %-10d %-12d %-10d %-10.0f %-10.2f %-12.2f %-10s %-25s%n",
                            i + 1,
                            scores[i][0],
                            scores[i][1],
                            scores[i][2],
                            results[i][0],
                            results[i][1],
                            results[i][2],
                            grades[i][0],
                            grades[i][1]);
        }
        
        System.out.println("-".repeat(120));
        
        displayGradeSummary(grades);
    }
    
    public static void displayGradeSummary(String[][] grades) {
        int[] gradeCount = new int[6];
        String[] gradeNames = {"A", "B", "C", "D", "E", "R"};
        
        for (String[] grade : grades) {
            switch (grade[0]) {
                case "A": gradeCount[0]++; break;
                case "B": gradeCount[1]++; break;
                case "C": gradeCount[2]++; break;
                case "D": gradeCount[3]++; break;
                case "E": gradeCount[4]++; break;
                case "R": gradeCount[5]++; break;
            }
        }
        
        System.out.println("\nGRADE DISTRIBUTION SUMMARY:");
        System.out.println("-".repeat(50));
        System.out.printf("%-6s %-10s %-15s%n", "Grade", "Count", "Percentage");
        System.out.println("-".repeat(50));
        
        for (int i = 0; i < gradeCount.length; i++) {
            double percentage = (gradeCount[i] * 100.0) / grades.length;
            System.out.printf("%-6s %-10d %-15.1f%%%n", 
                            gradeNames[i], gradeCount[i], percentage);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Generating marks for Physics, Chemistry, and Mathematics");
        
        System.out.print("\nEnter the number of students: ");
        int numStudents = scanner.nextInt();
        
        if (numStudents <= 0) {
            System.out.println("Please enter a valid number of students.");
            scanner.close();
            return;
        }
        
        int[][] pcmScores = generatePCMscores(numStudents);
        double[][] studentResults = calculateResults(pcmScores);
        String[][] studentGrades = calculateGrades(studentResults);
        displayScorecard(pcmScores, studentResults, studentGrades);
        
        scanner.close();
    }
}