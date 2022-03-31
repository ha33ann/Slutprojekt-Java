package com.example.demo;

import java.util.Random;


public class RockPaperScissors {

    public static String play(String choice) {

        String result = "";
        
        String playerChoice = choice;
        String opponentChoice = generateOpponentChoice();

        if (playerChoice.equals(opponentChoice)) {
            
            result = "Draw!";
        
        } else if ((playerChoice.equals("rock") && opponentChoice.equals("paper") ) ||
                (playerChoice.equals("scissors") && opponentChoice.equals("rock") ) ||
                (playerChoice.equals("paper") && opponentChoice.equals("scissors") ) ) {

            result = "Player lost!";

        } else if
            ((playerChoice.equals("rock") && opponentChoice.equals("scissors") ) ||
                (playerChoice.equals("scissors") && opponentChoice.equals("paper") ) ||
                (playerChoice.equals("paper") && opponentChoice.equals("rock") ) ){
                   
                    result = "Player won!";
                }
                else{
                    return (GameBean.error());
                }
        

        switch(result) {
        case "Player won!":
            GameBean.addWin();
            break;
        case "Player lost!":
            GameBean.addLoss();
            break;
        case "Draw!":
            GameBean.addTie();
            break;
        }
        GameBean.addGameRound();

        String gameround = "{" +
        "\"Player chose\":" + "\"" + playerChoice + "\"" +
        "," +
        "\"Computer chose\":" + "\"" + opponentChoice + "\"" + 
        "," +
        "\"Result\":" + "\"" + result + "\"" +
        "," +
        "\"Wins\":" + "\"" + GameBean.getWins() + "\"" + 
        "," +
        "\"Losses\":" + "\"" + GameBean.getLosses() + "\"" + 
         "}";
        return gameround + " Type http://localhost:8080/play to see all result in JSON format";
    }

    private static String generateOpponentChoice() {

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String returnString = "";

        switch (randomNumber) {
            case 0:
                returnString = "rock";
                break;
            case 1:
                returnString = "paper";
                break;
            case 2:
                returnString = "scissors";
                break;
        }
        return returnString;
    }
}