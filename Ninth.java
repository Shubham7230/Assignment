// Write a Java program to demonstrate autoboxing and unboxing.
public class Ninth {
    public static void main(String[] args) {
        int primitiveInt = 10;              
        Integer wrapperInt = primitiveInt;  

        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrapperInt);
        Integer objInt = new Integer(20);   
        int unboxedInt = objInt;            

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Integer: " + objInt);
        System.out.println("Unboxed int: " + unboxedInt);
    }
}
