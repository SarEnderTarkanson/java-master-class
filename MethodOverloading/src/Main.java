public class Main {

    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Alpy", 1));
        System.out.println("The newer score is " + calculateScore(2));
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore(int score) {

        return calculateScore("Endo", score);

    }

    public static int calculateScore() {

        System.out.println("No player name, so no score");
        return 0;

    }
}
