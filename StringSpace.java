import java.util.Scanner;

public class StringSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("Characters (stop at space):");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                break;
            }
            System.out.print(ch + " ");
        }
        scanner.close();
    }
}