import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = scanner.nextInt();
        
        double average = (physics + chemistry + maths) / 3.0;
        double percentage = average;
        
        System.out.println("Average Mark: " + average);
        
        String grade, remarks;
        
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Outstanding";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "Very Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Satisfactory";
        } else if (percentage >= 40) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}