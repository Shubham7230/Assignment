public class ContinueExample {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 10 (skip 5):");
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}