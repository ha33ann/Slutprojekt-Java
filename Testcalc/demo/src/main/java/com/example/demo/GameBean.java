package com.example.demo;

public class GameBean {
    private static int wins = 0;
    private static int losses = 0;
    private static int ties = 0;
    private static int gameRounds = 0;

    public static void addWin() {
        wins++;
    }

    public static void addLoss () {
        losses++;
    }

    public static void addTie () {
        ties++;
    }

    public static int getWins () {
        return wins;
    }

    public static int getLosses () {
        return losses;
    }

    public static String error(){
        return "Error, please chose either rock, paper or scissors!";
    }

    public static void addGameRound () {
        gameRounds++;
    }

    public static String getGameState () {
        
        String returnJSON = "{\"wins\":\"" + wins + "\",\"losses\":\"" + losses + "\",\"ties\":\"" + ties + "\",\"rounds\":\"" + gameRounds + "\"}";
        System.out.println(returnJSON);
        return returnJSON;
    }
}