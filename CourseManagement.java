public class CourseManagement {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";

    public CourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("------------------------------");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        CourseManagement course1 = new CourseManagement("Java Programming", 6, 499.99);
        CourseManagement course2 = new CourseManagement("Python Fundamentals", 4, 399.99);
        
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        
        CourseManagement.updateInstituteName("Tech Learning Hub");
        
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}