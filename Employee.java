public class Employee {
    private static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;
    
    private final String id;
    private String name;
    private String designation;
    
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    public static void setCompanyName(String name) {
        companyName = name;
    }
    
    public static String getCompanyName() {
        return companyName;
    }
    
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    
    public void displayEmployeeDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("----------------------");
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public static void displayIfEmployee(Object obj) {
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            employee.displayEmployeeDetails();
        } else {
            System.out.println("Error: The provided object is not an Employee instance");
        }
    }
    
    public static void main(String[] args) {
        Employee.setCompanyName("Global Innovations Ltd.");
        
        Employee emp1 = new Employee("John Smith", "EMP001", "Software Engineer");
        Employee emp2 = new Employee("Sarah Johnson", "EMP002", "Project Manager");
        Employee emp3 = new Employee("Mike Wilson", "EMP003", "QA Analyst");
        
        System.out.println("Company: " + Employee.getCompanyName());
        Employee.displayTotalEmployees();
        
        System.out.println("Displaying employee details with instanceof check:");
        Employee.displayIfEmployee(emp1);
        Employee.displayIfEmployee(emp2);
        
        Integer testObject = 12345;
        Employee.displayIfEmployee(testObject);
        
        System.out.println("Employee 1 ID: " + emp1.getId());
        System.out.println("Employee 2 Name: " + emp2.getName());
        System.out.println("Employee 3 Designation: " + emp3.getDesignation());
    }
}