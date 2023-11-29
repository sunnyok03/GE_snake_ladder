package com.bridgelabz;


/*
@desc: This class describes logic and implementation
of snake and ladder game
 */
public class SnakeLadder {
    public static final int lastPos = 100;
    public static final int startPos = 0;


    public static void main(String[] args) {
        System.out.println("Starting with single player from position 0.");
        int posPlayer1 = 0;
        int posPlayer2 = 0;


        int countOfDiceRoll1 = 0;
        int countOfDiceRoll2 = 0;

        /*
        turn->1 means player 1 turns
        turn->2 means player 2 turns
         */
        int turn = 1;
        while (posPlayer2 != 100 && posPlayer1 != 100) {
            int diceNum = (int) (Math.random() * 6) + 1; // dice number from 1 to 6
            /*
            1 -> ladder (move forward)
            0 -> snake (move backward)
            */
            int ladderOrSnake = Math.random() <= 0.5 ? 1 : 0;
            if (turn == 1) {
                if (ladderOrSnake == 1) {
                    if (posPlayer1 + diceNum > lastPos) {
                        System.out.println("Player 1 stayed to same pos: " + posPlayer1);
                    } else {
                        posPlayer1 += diceNum;
                        System.out.println("Player 1 found ladder and moved to pos: " + posPlayer1);
                    }
                } else {
                    if (posPlayer1 - diceNum < startPos) {
                        posPlayer1 = 0;
                        System.out.println("Player 1 reached 0");
                    } else {
                        posPlayer1 -= diceNum;
                        System.out.println("Player 1 found snake and moved to pos: " + posPlayer1);
                    }
                    turn = 2;
                }
                countOfDiceRoll1++;
            } else {
                if (ladderOrSnake == 1) {
                    if (posPlayer2 + diceNum > lastPos) {
                        System.out.println("Player 2 stayed to same pos: " + posPlayer2);
                    } else {
                        posPlayer2 += diceNum;
                        System.out.println("Player 2 found ladder and moved to pos: " + posPlayer2);
                    }
                } else {
                    if (posPlayer2 - diceNum < startPos) {
                        posPlayer2 = 0;
                        System.out.println("Player 2 reached to 0");
                    } else {
                        posPlayer2 -= diceNum;
                        System.out.println("Player 2 found snake and moved to pos: " + posPlayer2);
                    }
                    turn = 1;
                }
                countOfDiceRoll2++;
            }
        }
        if(posPlayer1 == 100){
            System.out.println("Player 1 won.");
        }else{
            System.out.println("Player 2 won.");
        }
        System.out.println("Player 1 took " + countOfDiceRoll1 + " dice rolls.");
        System.out.println("Players 2 took " + countOfDiceRoll2 + " dice rolls.");
    }
}
