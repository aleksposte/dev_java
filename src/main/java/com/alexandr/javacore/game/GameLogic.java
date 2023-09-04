package com.alexandr.javacore.game;

import java.util.Scanner;

class GameLogic {

    private String userValue;
    private String computerValue;

    private final Scanner inputScanner = new Scanner(System.in);
    private final Field field = new Field();

    public void start () {
        GameLogic playGame = new GameLogic();

        String userInput = playGame.getUserInput();
        while (!validateInput(userInput)) {
            playGame.getUserInput();
        }

        String compInput = playGame.getCompValue();
        while (!validateInput(compInput)) {
            playGame.getCompValue();
        }

        field.setUserMove(userInput);
        field.setCompMove(compInput);
        field.printField();
        calculateResult();
    }

    private boolean validateInput (String input){
        if (input.equals("rock") || input.equals("scissors") || input.equals("paper"))
            return true;
        return false;
    }

    public String getUserInput () {
        System.out.println("choice and enter: rock, enter - r, paper, enter - p, scissors, enter - s");

        String userInput = inputScanner.nextLine();
        userInput = String.valueOf(userInput.charAt(0));

        switch (userInput) {
            case "r" -> userValue = "rock";
            case "s" -> userValue = "scissors";
            case "p" -> userValue = "paper";
        }
        return userValue;
    }

    public String getCompValue () {
        int computerInt = (int) (Math.random() * 3) + 1;

        switch (computerInt) {
            case 1 -> userValue = "rock";
            case 2 -> userValue = "scissors";
            case 3 -> userValue = "paper";
        }
        return computerValue;
    }

    public void calculateResult () {
        String userValue = field.getUserMove();
        String computerValue = field.getCompMove();

        if (userValue.equals(computerValue))
            showResult("did not win - friendship won :)");
        else if (userValue.equals("rock") && computerValue.equals("scissors"))
            showResult("win");
        else if (userValue.equals("scissors") && computerValue.equals("paper"))
            showResult("win");
        else if (userValue.equals("paper") && computerValue.equals("rock"))
            showResult("win");
        else showResult("loss");

        System.out.println("do you want to play again? (y/n)");
        String playAgain = inputScanner.nextLine();

        if (String.valueOf(playAgain.charAt(0)).equals("y"))
            start();
    }

    public void showResult (String result){
        System.out.println("You " + result + "!");
    }
}
