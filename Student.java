public class Student {
    private static String universityName = "National University";
    private static int totalStudents = 0;
    
    private final String rollNumber;
    private String name;
    private String grade;
    
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    
    public static void setUniversityName(String name) {
        universityName = name;
    }
    
    public static String getUniversityName() {
        return universityName;
    }
    
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
    
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated for " + name + ": " + newGrade);
    }
    
    public String getRollNumber() {
        return rollNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public static void operateIfStudent(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            student.displayStudentDetails();
        } else {
            System.out.println("Error: The provided object is not a Student instance");
        }
    }
    
    public static void updateGradeIfStudent(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            student.updateGrade(newGrade);
        } else {
            System.out.println("Error: Cannot update grade - object is not a Student instance");
        }
    }
    
    public static void main(String[] args) {
        Student.setUniversityName("State University");
        
        Student student1 = new Student("Alice Johnson", "STU001", "A");
        Student student2 = new Student("Bob Smith", "STU002", "B");
        Student student3 = new Student("Carol Williams", "STU003", "C");
        
        System.out.println("University: " + Student.getUniversityName());
        Student.displayTotalStudents();
        
        System.out.println("Operating on students with instanceof check:");
        Student.operateIfStudent(student1);
        Student.operateIfStudent(student2);
        
        String testObject = "Not a student";
        Student.operateIfStudent(testObject);
        
        System.out.println("Updating grades with instanceof check:");
        Student.updateGradeIfStudent(student3, "B+");
        Student.updateGradeIfStudent(testObject, "A");
        
        System.out.println("Student 1 Roll Number: " + student1.getRollNumber());
        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 3 Grade: " + student3.getGrade());
    }
}