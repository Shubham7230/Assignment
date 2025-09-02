// Write a Java program to show the difference between static and instance variables.
public class Thirtinth {
    int instanceVar = 10;
    static int staticVar = 20;
    public static void main(String[] args) {
        Thirtinth obj1 = new Thirtinth();
        Thirtinth obj2 = new Thirtinth();
        System.out.println("---- Before Modification ----");
        System.out.println("Object 1 -> InstanceVar: " + obj1.instanceVar + ", StaticVar: " + obj1.staticVar);
        System.out.println("Object 2 -> InstanceVar: " + obj2.instanceVar + ", StaticVar: " + obj2.staticVar);
        obj1.instanceVar = 50;   
        obj1.staticVar = 100;   
        System.out.println("\n---- After Modification ----");
        System.out.println("Object 1 -> InstanceVar: " + obj1.instanceVar + ", StaticVar: " + obj1.staticVar);
        System.out.println("Object 2 -> InstanceVar: " + obj2.instanceVar + ", StaticVar: " + obj2.staticVar);
    }
}
