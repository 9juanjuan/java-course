public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // if(score <= 5000) {
        //     System.out.println("Your score was less than 5000 but greater than 1000");
        // } else if (score < 1000) {
        //     System.out.println("Your score was less than 1000");
        // } else {
        //     System.out.println("got here");
        // }

        // if (gameOver) {
        //     int finalScore = score +(levelCompleted * bonus);
        //     System.out.println("Your final score was  " + finalScore);
        // }

        score = 10000;
        levelCompleted = 8; 
        bonus = 200;


        if (gameOver) {
            int finalScore = score +(levelCompleted * bonus);
            finalScore += 5000;
            System.out.println("Your final score was  " + finalScore);
        }

            // Not part of the if check
        System.out.println("This was executed"
        );
    }
}