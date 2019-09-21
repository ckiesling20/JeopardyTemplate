import objects.GameBoard;
import objects.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // Put code you want to run here
        // Then press the green arrow to the left to run it

        Scanner input = new Scanner (System.in);
        int numOfQuestions = 3;
        String playerOneAnswer = "null";
        String playerTwoAnswer = "null";
        GameBoard gameBoard = new GameBoard();

        System.out.println("Player one, please enter your name.");
        Player one = new Player(input.nextLine());
        System.out.println("Player two, please enter your name.");
        Player two = new Player(input.nextLine());
        System.out.println("Hello " + one.getName() + " and " + two.getName());

        for (int i = 0; i < numOfQuestions ;i++){
            System.out.println(gameBoard.getQuestion(i));
            System.out.println(one.getName() + " please type your answer");
            playerOneAnswer = input.nextLine();
            System.out.println(two.getName() + " please type your answer");
            playerTwoAnswer = input.nextLine();
            if(playerOneAnswer.equals(gameBoard.getAnswer(i)) && playerTwoAnswer.equals(gameBoard.getAnswer(i))) {
                System.out.println("You are both correct! You both get a point!");
                one.addPoint();
                two.addPoint();
                continue;
            }
            if(playerOneAnswer.equals(gameBoard.getAnswer(i))){
                one.addPoint();
                System.out.println(one.getName() + " is correct. They get a point.");
                continue;
            }
            if(playerTwoAnswer.equals(gameBoard.getAnswer(i))){
                two.addPoint();
                System.out.println(two.getName() + " is correct. They get a point.");
                continue;
            }
               System.out.println("You were both incorrect. The correct answer was " + gameBoard.getAnswer(i));
        }

        if(one.getPoints() > two.getPoints()){
            System.out.println(one.getName() + " wins, with " + one.getPoints() + " points! Congrats!");
            return;
        }
        if(one.getPoints() < two.getPoints()){
            System.out.println(two.getName() + " wins, with " + two.getPoints() + " points! Congrats!");
            return;
        }
        System.out.println("You have tied, with " + one.getPoints() + " points! Nobody wins!");
    }
}