package com.alexandr.javacore.game;

class Field {
    private String userMove;
    private String compMove;

    public String getUserMove() {
        return userMove;
    }

    public void setUserMove(String userMove) {
        this.userMove = userMove;
    }


    public String getCompMove() {
        return compMove;
    }

    public void setCompMove(String compMove) {
        this.compMove = compMove;
    }

    public void printField() {
        System.out.println("you choice: " + userMove);
        System.out.println("computer choice: " + compMove);
    }
}
