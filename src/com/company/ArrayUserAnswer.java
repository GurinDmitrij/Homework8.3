package com.company;

import java.util.Arrays;

public class ArrayUserAnswer {
    int[] userAnswerArray;

    public ArrayUserAnswer(int[] userAnswerArray) {
        this.userAnswerArray = userAnswerArray;
    }

    public int[] getUserAnswerArray() {
        return userAnswerArray;
    }

    public void setUserAnswerArray(int[] userAnswerArray) {
        this.userAnswerArray = userAnswerArray;
    }

    public boolean isCorrect(Question question, int userChoice){
        return question.getIndexOfCorrectAnswer() == userChoice;
    }
    @Override
    public String toString() {
        return ""
                + Arrays.toString(userAnswerArray)
                ;
    }
}
