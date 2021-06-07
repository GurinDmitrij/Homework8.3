package com.company;

import java.util.Arrays;

public class Question {

   private String question;
   private String[] answerOption;
   private int  indexOfCorrectAnswer;

    public Question(String question, String[] answerOption, int indexOfCorrectAnswer) {
        this.question = question;
        this.answerOption = answerOption;
        this.indexOfCorrectAnswer = indexOfCorrectAnswer;
    }

    public int getIndexOfCorrectAnswer() {
        return indexOfCorrectAnswer;
    }

    public void setIndexOfCorrectAnswer(int indexOfCorrectAnswer) {
        this.indexOfCorrectAnswer = indexOfCorrectAnswer;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return  question + "\n" + Arrays.toString(answerOption) ;
    }
}
