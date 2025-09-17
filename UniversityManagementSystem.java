class ManagementSystem {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public ManagementSystem(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println("------------------------------");
    }
}

class PostgraduateStudent extends ManagementSystem {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("------------------------------");
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        ManagementSystem student1 = new ManagementSystem(101, "Alice Johnson", 8.5);
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob Smith", 9.2, "Artificial Intelligence");

        student1.displayStudentDetails();
        pgStudent.displayPostgraduateDetails();

        System.out.println("Accessing protected member from subclass: " + pgStudent.name);
        System.out.println("Accessing CGPA through public method: " + pgStudent.getCGPA());

        pgStudent.setCGPA(9.5);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());
    }
}