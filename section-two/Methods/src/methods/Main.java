package methods;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        
        calculateScore(gameOver, score, levelCompleted, bonus);

        displayHighScorePosition("Tim",  calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(900)); 
        displayHighScorePosition("Percy", calculateHighScorePosition(400)); 
        displayHighScorePosition("Gilbert", calculateHighScorePosition(50)); 
        displayHighScorePosition("Louise", calculateHighScorePosition(1000)); 

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score +(levelCompleted * bonus);
            finalScore +=1000;
            return finalScore;
        } 
        return -1;
    }
    public static void displayHighScorePosition(String name, int position) {
    	System.out.println(name +" managed to get in position " + position + " on the highscore table");
    }
    public static int calculateHighScorePosition(int score) {
//    	if (score >= 1000) {
//    		return 1;
//    	} else if ((score >= 500) && (score < 1000)) {
//    		return 2;
//    	} else if ((score >= 100) && (score < 500)) {
//    		return 3;
//    	}
//    	return 4;
    	int position = 4;
    	
    	if (score >= 1000) {
    		position = 1; 
    	} else if (score >=500) {
    		position = 2;
    	} else if (score >= 100) {
    		position = 3;
    	}
    	return position;
    }
}