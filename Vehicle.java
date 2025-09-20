public class Vehicle {
    private static double registrationFee = 100.0;
    
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    public static double getRegistrationFee() {
        return registrationFee;
    }
    
    public void displayRegistrationDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println("----------------------");
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public static void displayIfVehicle(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            vehicle.displayRegistrationDetails();
        } else {
            System.out.println("Error: The provided object is not a Vehicle instance");
        }
    }
    
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(120.0);
        
        Vehicle vehicle1 = new Vehicle("John Doe", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "SUV", "XYZ789");
        Vehicle vehicle3 = new Vehicle("Mike Johnson", "Truck", "DEF456");
        
        System.out.println("Current Registration Fee: $" + Vehicle.getRegistrationFee());
        System.out.println("Displaying vehicle details with instanceof check:");
        
        Vehicle.displayIfVehicle(vehicle1);
        Vehicle.displayIfVehicle(vehicle2);
        
        Integer testObject = 12345;
        Vehicle.displayIfVehicle(testObject);
        
        Vehicle.updateRegistrationFee(150.0);
        System.out.println("Updated Registration Fee: $" + Vehicle.getRegistrationFee());
        Vehicle.displayIfVehicle(vehicle3);
        
        System.out.println("Vehicle 1 Registration: " + vehicle1.getRegistrationNumber());
        System.out.println("Vehicle 2 Owner: " + vehicle2.getOwnerName());
        System.out.println("Vehicle 3 Type: " + vehicle3.getVehicleType());
    }
}