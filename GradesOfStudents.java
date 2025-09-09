import java.util.Scanner;

public class GradesOfStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Physics: ");
                int physics = scanner.nextInt();
                if (physics < 0) {
                    System.out.println("Marks cannot be negative. Please enter positive values.");
                    continue;
                }
                
                System.out.print("Chemistry: ");
                int chemistry = scanner.nextInt();
                if (chemistry < 0) {
                    System.out.println("Marks cannot be negative. Please enter positive values.");
                    continue;
                }
                
                System.out.print("Maths: ");
                int maths = scanner.nextInt();
                if (maths < 0) {
                    System.out.println("Marks cannot be negative. Please enter positive values.");
                    continue;
                }
                
                physicsMarks[i] = physics;
                chemistryMarks[i] = chemistry;
                mathsMarks[i] = maths;
                validInput = true;
            }
        }
        
        for (int i = 0; i < numStudents; i++) {
            double total = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (total / 300) * 100;
            
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        
        System.out.println("\nStudent Results:");
        System.out.println("------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%c%n", 
                (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
        
        scanner.close();
    }
}