// Write a Java program to show memory allocation difference between primitive and reference variables.
public class Fiftinth {
    int primitiveVar = 10;
    String referenceVar = "Hello";
    public static void main(String[] args) {
        Fiftinth obj = new Fiftinth();
        System.out.println("Primitive Variable (stored directly in stack): " + obj.primitiveVar);
        System.out.println("Reference Variable (reference in stack, object in heap): " + obj.referenceVar);
        String str1 = "Java";
        String str2 = str1; 
        System.out.println("\nBefore changing str1:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        str1 = "Programming"; 
        System.out.println("\nAfter changing str1:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
