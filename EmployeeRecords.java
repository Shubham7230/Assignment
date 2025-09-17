class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            double raiseAmount = salary * percentage / 100;
            salary += raiseAmount;
            System.out.println("Raise applied: $" + raiseAmount);
        } else {
            System.out.println("Invalid raise percentage!");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("------------------------------");
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + getSalary());
        System.out.println("Team Size: " + teamSize);
        System.out.println("------------------------------");
    }

    public void manageTeam() {
        System.out.println("Manager " + employeeID + " is managing a team of " + teamSize + " people in " + department + " department");
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "IT", 50000.0);
        Manager mgr1 = new Manager(2001, "Engineering", 80000.0, 10);

        emp1.displayEmployeeDetails();
        mgr1.displayManagerDetails();

        System.out.println("Accessing public employeeID from subclass: " + mgr1.employeeID);
        System.out.println("Accessing protected department from subclass: " + mgr1.department);
        System.out.println("Accessing salary through public method: $" + mgr1.getSalary());

        mgr1.giveRaise(15.0);
        mgr1.displayManagerDetails();

        mgr1.setSalary(95000.0);
        System.out.println("Updated Salary: $" + mgr1.getSalary());

        mgr1.manageTeam();
    }
}