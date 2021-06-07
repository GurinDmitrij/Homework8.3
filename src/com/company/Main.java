package com.company;


import java.util.Scanner;

public class Main {

    /**
     * Resize array
     * @param arr source array
     * @param size size od new array
     * @return resized array
     */
    public static int[] resizeArray(int[] arr,int size){
        int userAnswer[] =new int[size];
        for (int i = 0; i < Math.min(arr.length,size); i++) {
            userAnswer[i] = arr[i];
        }
        return userAnswer;
    }

    /**
     * Filling array
     * @param arr source array
     * @param answerUser new element in array
     * @return new array with new element
     */
    public static int[] arrayFill(int arr[],int answerUser) {
        //int array[] = new int[arr.length+1];
        int userAnswer[] = resizeArray(arr, arr.length + 1);
        userAnswer[arr.length] = answerUser;

        return userAnswer;
    }

    public static void main(String[] args) {
        Question [] questions = new Question[10];
        Scanner sc = new Scanner(System.in);
        AnswerReader reader = new AnswerReader(sc);
        ArrayUserAnswer arrayUserAnswer= new ArrayUserAnswer(new int[0]);


        questions[0] = new Question("1. Solve 2+2 ",new String[]{"2","4","5","6"},2);
        questions[1] = new Question("2. How many oceans are there on our planet ?",new String[]{"4","5","6","7"},2);
        questions[2] = new Question("3. Which planet from the Sun is Saturn ?",new String[]{"3","8","6","4"},3);
        questions[3] = new Question("4. The longest river in the world ?",new String[]{"Amazon","Nile","Yangtze","Elena"},1);
        questions[4] = new Question("5. What number is denoted by Roman numerals LVXXII?",new String[]{"52","77","152","55"},2);
        questions[5] = new Question("6. How many chromosomes are in the human genome ?",new String[]{"42","44","46","48"},3);
        questions[6] = new Question("7. How many planets are in the solar system ?",new String[]{"5","6","7","8"},4);
        questions[7] = new Question("8. Solve an example (13 * 9) - (132 / 6) =  ?",new String[]{"95","102","80","44"},1);
        questions[8] = new Question("9. The lightest gas is ?",new String[]{"Nitrogen","Oxygen","Hydrogen","Neon"},3);
        questions[9] = new Question("10. How many miles in one kilometer ?",new String[]{"0.6","1.8","2.5","1.5"},3);


        for (int i = 0; i < 10; i++) {
            System.out.println(questions[i]);
            Answer answer =reader.readChoice();

            arrayUserAnswer.userAnswerArray =arrayFill(arrayUserAnswer.userAnswerArray,answer.getChooseVariant());


        }


        int mark = 0;
        for (int i = 0; i < 10; i++) {
            if (arrayUserAnswer.getUserAnswerArray()[i] == questions[i].getIndexOfCorrectAnswer()){
                mark++;
            }

        }

        for (int i = 0; i < 10; i++) {
            if (arrayUserAnswer.getUserAnswerArray()[i] != questions[i].getIndexOfCorrectAnswer()){
                System.out.println(questions[i].getQuestion() +"\n Your answer is "+ arrayUserAnswer.getUserAnswerArray()[i] +
                                                                "\n Correct answer is " +questions[i].getIndexOfCorrectAnswer());
            }

        }

       

        System.out.println("Mark is "+mark);
        System.out.println();
    }
}
