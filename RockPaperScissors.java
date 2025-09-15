import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if (user.equals("rock") && computer.equals("scissors")) return "user";
        if (user.equals("paper") && computer.equals("rock")) return "user";
        if (user.equals("scissors") && computer.equals("paper")) return "user";
        return "computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int draws, int total) {
        double userPercent = total > 0 ? (userWins * 100.0 / total) : 0;
        double compPercent = total > 0 ? (compWins * 100.0 / total) : 0;
        double drawPercent = total > 0 ? (draws * 100.0 / total) : 0;

        return new String[][] {
            {"Result", "Count", "Percentage"},
            {"User  Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
            {"Computer Wins", String.valueOf(compWins), String.format("%.2f%%", compPercent)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercent)}
        };
    }

    public static void displayResults(String[] userChoices, String[] compChoices, String[] winners, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-6s %-12s %-15s %-10s\n", "Game", "User ", "Computer", "Winner");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.printf("%-6d %-12s %-15s %-10s\n", i + 1, userChoices[i], compChoices[i], winners[i]);
        }
        System.out.println("\nStatistics:");
        for (String[] row : stats) {
            System.out.printf("%-15s %-10s %-10s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] userChoices = new String[n];
        String[] compChoices = new String[n];
        String[] winners = new String[n];

        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            String userChoice;
            while (true) {
                System.out.print("Game " + (i + 1) + " - Enter rock, paper, or scissors: ");
                userChoice = sc.nextLine().toLowerCase();
                if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) break;
                System.out.println("Invalid input, try again.");
            }
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            userChoices[i] = userChoice;
            compChoices[i] = compChoice;
            winners[i] = winner;

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
            else draws++;
        }

        String[][] stats = calculateStats(userWins, compWins, draws, n);
        displayResults(userChoices, compChoices, winners, stats);
        sc.close();
    }
}
