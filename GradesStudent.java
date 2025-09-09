import java.util.Scanner;

public class GradesStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();
        
        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextInt();
            
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 3.0);
            
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }
        
        System.out.println("\nStudent Results:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------");
        
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%c%n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
        
        scanner.close();
    }
}