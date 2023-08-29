package com.alexandr.javacore.game;
import java.util.Scanner;

//Классы (минимально необходимые):
//
//Field - сущность, описывающая игровое поле
//GameLogic - содержит бизнес-логику игры
//GameRunner - главный класс приложения, содержащий метод main


public class GameRunner {
    public static void main(String[] args) {
        GameRunner game = new GameRunner();
        game.start();

//        Field field = new Field();
//        field.startGame();
//
//        GameLogic playGame = new GameLogic();
//        playGame.getUserInput();
//        playGame.getCompValue();
//        playGame.result();
    }

    public static void start() {
        Field field = new Field();
        field.startGame();

        GameLogic playGame = new GameLogic();
        playGame.getUserInput();
        playGame.getCompValue();
        playGame.result();
    }
}

class Field {
    public void startGame() {
        System.out.println("Do you want to start play? Y/N");
        Scanner inputScanner = new Scanner(System.in);
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();

        if(userInput.charAt(0) == 'Y') {
            System.out.println("Choice and enter: rock, enter - r, paper, enter - p, scissors, enter - s");
        } else System.out.println("game over");;
    }

    public void showResult(String result, String choice1, String choice2) {
        System.out.println("You " + result + "!; your - " + choice1 + ", comp - " + choice2);

        GameRunner.start();
    }
}

class GameLogic {
    String userValue;
    String computerValue;

    Field field = new Field(); // те нужно каждый раз создовать объект?

    public void getUserInput() {
        Scanner inputScanner = new Scanner(System.in);
        String userInput = inputScanner.nextLine();
        userInput = String.valueOf(userInput.charAt(0));
        // сделать проверку на ввод // r - rock, s - scissors, p - paper
        switch  (userInput) {
            case "r": userValue = "rock"; break;
            case "s": userValue = "scissors"; break;
            case "p": userValue = "paper"; break;
            default:
                System.out.println("invalid input");
        }
    }

    public void getCompValue() {
        int computerInt = (int)(Math.random()*3) +1;

        switch  (computerInt) {
            case 1: computerValue = "rock"; break;
            case 2: computerValue = "scissors"; break;
            case 3: computerValue = "paper"; break;
        }
    }

    public void result() {
        // проверка на ничью
        if (userValue == "rock" && computerValue == "rock"
            || userValue == "scissors" && computerValue == "scissors"
            || userValue == "paper" && computerValue == "paper")
            field.showResult("did not win - friendship won :)", userValue, computerValue);
        else if (userValue == "rock" && computerValue == "scissors")
            field.showResult("win", userValue, computerValue);
        else if (userValue == "scissors" && computerValue == "paper")
            field.showResult("win", userValue, computerValue);
        else if (userValue == "paper" && computerValue == "rock")
            field.showResult("win", userValue, computerValue);
        else field.showResult("loss", userValue, computerValue);
    }
}
