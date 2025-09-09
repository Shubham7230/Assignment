public class BreakExample {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 10 (break at 7):");
        
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}