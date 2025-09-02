// Write a Java program to use var (Java 10+) for type inference.
public class Seventinth {
    public static void main(String[] args) {
        var num = 100;              
        var pi = 3.14159;       
        var name = "Java";         
        var flag = true;            
        System.out.println("Integer Value: " + num);
        System.out.println("Double Value: " + pi);
        System.out.println("String Value: " + name);
        System.out.println("Boolean Value: " + flag);
        var str = new String("Hello World");
        System.out.println("Object (String) Value: " + str);
    }
}
