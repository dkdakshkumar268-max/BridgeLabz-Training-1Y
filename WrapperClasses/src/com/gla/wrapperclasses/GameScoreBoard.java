package com.gla.wrapperclasses;

public class GameScoreBoard {
    public static void main(String[] args)
    {
        Integer[] scores = {100, null, 200, 300, null, 150};
        int notPlayedCount = 0;
        int totalScore = 0;
        for (int i = 0; i < scores.length; i++)
        {

            if (scores[i] == null)
            {
                notPlayedCount++;
            } else
            {
                totalScore += scores[i];
            }
        }
        System.out.println("Players not played: " + notPlayedCount);
        System.out.println("Total Score: " + totalScore);
    }
}
