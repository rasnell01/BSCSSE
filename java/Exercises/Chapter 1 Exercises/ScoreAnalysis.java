//Ryan Snell
//Chapter 1 Exercise
//08 Feb 2024

//imports
import java.util.Arrays;

public class ScoreAnalysis {

    public static void main(String[] args) {
        int[] score = {100, 98, 76, 85, 99, 100};

        System.out.println("The scores for the course are: " + Arrays.toString(score));
        System.out.println("The highest score in the course is: " + highestScore(score));
        System.out.println("The lowest score in the course is: " + lowestScore(score));
        System.out.println("The average score in the course is: " + averageScore(score));


    }//end main

    private static int lowestScore(int[] score) {

        int temp = 100;
        int lowestScore;

        for (int i = 0; i < score.length; i++) {

            if (temp > score[i])
                temp = score[i];
        }
        lowestScore = temp;
        return lowestScore;

    }//end method

    private static int highestScore(int[] score) {

        int temp = 0;
        int highestScore;
        for (int i = 0; i < score.length; i++) {

            if (temp < score[i])
                temp = score[i];
        }
        highestScore = temp;
        return highestScore;
    }//end method highestScore

    private static int averageScore(int[] score) {

        int temp;
        int averageScore;

        temp = Arrays.stream(score).sum();
        averageScore = temp / score.length;
        return averageScore;
    }//end method averageScore

}//end class
