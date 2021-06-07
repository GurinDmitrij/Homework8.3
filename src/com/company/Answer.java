package com.company;

import java.util.Scanner;

public class Answer {
    private Question questions;
    private int chooseVariant;

    public Answer(int chooseVariant) {
        this.chooseVariant = chooseVariant;
    }

    public boolean isCorrect(int a, int b){

        return a==b;
        }





    public int getChooseVariant() {
        return chooseVariant;
    }

    public void setChooseVariant(int chooseVariant) {
        this.chooseVariant = chooseVariant;
    }

    @Override
    public String toString() {
        return ""+ chooseVariant;
    }
}
