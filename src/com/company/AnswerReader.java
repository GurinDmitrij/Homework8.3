package com.company;

import java.util.Scanner;

public class AnswerReader {
    public Scanner sc;

    public AnswerReader(Scanner sc) {
        this.sc = sc;
    }
public Answer readChoice(){
    System.out.println("Enter your choice");
    int choice = sc.nextInt();
    return new Answer(choice);
}
}
