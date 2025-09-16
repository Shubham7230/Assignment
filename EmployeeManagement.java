import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: ₹" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
        Employee emp = new Employee(name, id, salary);
        emp.displayDetails();
        
        scanner.close();
    }
}