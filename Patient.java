public class Patient {
    private static String hospitalName = "General Hospital";
    private static int totalPatients = 0;
    
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    
    public static void setHospitalName(String name) {
        hospitalName = name;
    }
    
    public static String getHospitalName() {
        return hospitalName;
    }
    
    public static int getTotalPatientsCount() {
        return totalPatients;
    }
    
    public void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("----------------------");
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAilment() {
        return ailment;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setAilment(String ailment) {
        this.ailment = ailment;
    }
    
    public static void displayIfPatient(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            patient.displayPatientDetails();
        } else {
            System.out.println("Error: The provided object is not a Patient instance");
        }
    }
    
    public static void main(String[] args) {
        Patient.setHospitalName("City Medical Center");
        
        Patient patient1 = new Patient("Alice Brown", 35, "Fever", "PAT001");
        Patient patient2 = new Patient("Bob Wilson", 68, "Hypertension", "PAT002");
        Patient patient3 = new Patient("Carol Davis", 42, "Fracture", "PAT003");
        
        System.out.println("Hospital: " + Patient.getHospitalName());
        Patient.getTotalPatients();
        
        System.out.println("Displaying patient details with instanceof check:");
        Patient.displayIfPatient(patient1);
        Patient.displayIfPatient(patient2);
        
        Double testObject = 98.6;
        Patient.displayIfPatient(testObject);
        
        System.out.println("Patient 1 ID: " + patient1.getPatientID());
        System.out.println("Patient 2 Name: " + patient2.getName());
        System.out.println("Patient 3 Ailment: " + patient3.getAilment());
        System.out.println("Total Patients Count: " + Patient.getTotalPatientsCount());
    }
}