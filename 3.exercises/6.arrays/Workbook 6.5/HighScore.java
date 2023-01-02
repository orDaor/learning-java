import java.util.Random;

import javax.print.event.PrintEvent;

public class HighScore {
    public static void main(String[] args) {
        
        int highestScore = 0;

        int upperBoundExcluded = 15;

        int[] scores = {
            getRandomInt(upperBoundExcluded), //0
            getRandomInt(upperBoundExcluded), //1
            getRandomInt(upperBoundExcluded), //2
            getRandomInt(upperBoundExcluded), //3
            getRandomInt(upperBoundExcluded), //4
            getRandomInt(upperBoundExcluded), //5
            getRandomInt(upperBoundExcluded), //6
            getRandomInt(upperBoundExcluded), //7
            getRandomInt(upperBoundExcluded), //8
            getRandomInt(upperBoundExcluded), //9
        };


        System.out.print("Here are the scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            //update highest score counter
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highestScore + ". Give that man a cookie!");
        
    } 
    
    public static int getRandomInt(int maxExcluded) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(maxExcluded);
    }

}
