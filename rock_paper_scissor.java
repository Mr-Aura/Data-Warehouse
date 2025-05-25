import java.io.*;
import java.util.*;

class base {
    protected int user_score = 0, computer_score = 0;
    final String SCORE_FILE = "scores.txt";

    protected void loadScores() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SCORE_FILE))) {
            user_score = Integer.parseInt(reader.readLine());
            computer_score = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            user_score = 0;
            computer_score = 0;
        }
    }

    protected void saveScores() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SCORE_FILE))) {
            writer.write(user_score + "\n");
            writer.write(computer_score + "\n");
        } catch (IOException e) {
            System.out.println("Error saving scores: " + e.getMessage());
        }
    }

    protected void game() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your choice (Rock, Paper, or Scissors):");
        String choice = sc.nextLine().toLowerCase();

        int a = random.nextInt(3);
        String computerChoice = (a == 0) ? "rock" : (a == 1) ? "paper" : "scissors";

        System.out.println("The computer selected " + computerChoice + ".");
        System.out.println("You selected " + choice + ".");

        if (choice.equals("rock")) {
            if (computerChoice.equals("rock")) {
                System.out.println("You both selected the same thing.");
            } else if (computerChoice.equals("paper")) {
                System.out.println("Computer wins.");
                computer_score++;
            } else {
                System.out.println("You win.");
                user_score++;
            }
        } else if (choice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                System.out.println("You win.");
                user_score++;
            } else if (computerChoice.equals("paper")) {
                System.out.println("You both selected the same thing.");
            } else {
                System.out.println("Computer wins.");
                computer_score++;
            }
        } else if (choice.equals("scissors")) {
            if (computerChoice.equals("rock")) {
                System.out.println("Computer wins.");
                computer_score++;
            } else if (computerChoice.equals("paper")) {
                System.out.println("You win.");
                user_score++;
            } else {
                System.out.println("You both selected the same thing.");
            }
        } else {
            System.out.println("Invalid input.");
        }

        saveScores();
        sc.close();
    }
}
class rock_paper_scissor extends base {
    public static void main(String[] args) {
        rock_paper_scissor game = new rock_paper_scissor();
        game.loadScores();
        game.game();
        System.out.println("Current Scores - You: " + game.user_score + " | Computer: " + game.computer_score);
    }
}