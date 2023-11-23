package com.snake_ladder;

public class SnakeLadder {
    public static final int lastPos = 100;
    public static final int startPos = 0;


    public static void main(String[] args) {
        System.out.println("Starting with single player from position 0.");
        int currPos = 0;

        int diceNum = (int)(Math.random()*6)+1; // dice number from 1 to 6

        /*
        1 -> ladder (move forward)
        0 -> snake (move backward)
         */
        int ladderOrSnake = Math.random() <= 0.5 ? 1 : 0;
        if(ladderOrSnake == 1){
            if(currPos + diceNum > lastPos){
                System.out.println("No play");
            }else{
                currPos += diceNum;
                System.out.println("Found ladder and moved to pos: " + currPos);
            }
        }else{
            if(currPos - diceNum < startPos){
                System.out.println("No play");
            }else{
                currPos -= diceNum;
                System.out.println("Found snake and moved to pos: " + currPos);
            }
        }


    }
}
