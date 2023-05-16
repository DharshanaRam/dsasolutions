package com.dharsh.codewars;

import java.util.*;

public class SnakeAndLadder {
  static Map<Integer,Integer> snakeNLadder = new HashMap<>();
  static int person1;
  static int person2;
  static boolean gameOver = false;
  String currentPlayer;
  public SnakeAndLadder() {
    person1 = 0;
    person2 = 0;
    currentPlayer = "Player 1";
    gameOver = false;
    //snakes
    snakeNLadder.put(99,80);
    snakeNLadder.put(95,75);
    snakeNLadder.put(92,88);
    snakeNLadder.put(89,68);
    snakeNLadder.put(74,53);
    snakeNLadder.put(64,60);
    snakeNLadder.put(62,19);
    snakeNLadder.put(46,25);
    snakeNLadder.put(49,11);
    snakeNLadder.put(16,6);
    //ladders
    snakeNLadder.put(2,38);
    snakeNLadder.put(7,14);
    snakeNLadder.put(8,31);
    snakeNLadder.put(15,26);
    snakeNLadder.put(21,42);
    snakeNLadder.put(36,44);
    snakeNLadder.put(28,84);
    snakeNLadder.put(51,67);
    snakeNLadder.put(71,91);
    snakeNLadder.put(78,98);
    snakeNLadder.put(87,94);
    }
    public String play(int die1, int die2) {
      Integer currPosition = 0;
      String result = "";
      if(gameOver){
        return "Game over!";
      }
      if("Player 1".equals(currentPlayer)){
        currPosition = person1+die1+die2;
        if(currPosition == 100){
          gameOver = true;
          person1 = currPosition;
          return "Player 1 Wins!";
        }else if(currPosition > 100){
          person1 = 100 - (die1+die2-(100-person1));
          if(snakeNLadder.containsKey(person1)){
            person1 = snakeNLadder.get(person1);
          }
        }else if(snakeNLadder.containsKey(currPosition)){
          person1 = snakeNLadder.get(currPosition);
        }else{
          person1 = currPosition;
        }
        result = currentPlayer + " is on square " + person1;
        if(die1 == die2){
          currentPlayer = "Player 1";
        }else{
          currentPlayer = "Player 2";
        }
      }else{
        currPosition = person2+die1+die2;
        if(currPosition == 100){
          gameOver = true;
          person2 = currPosition;
          return "Player 2 Wins!";
        }else if(currPosition > 100){
          person2 = 100 - (die1+die2-(100-person2));
          if(snakeNLadder.containsKey(person2)){
            person2 = snakeNLadder.get(person2);
          }
        }else if(snakeNLadder.containsKey(currPosition)){
          person2 = snakeNLadder.get(currPosition);
        }else{
          person2 = currPosition;
        }  
        result = currentPlayer + " is on square " + person2;
        if(die1 == die2){
          currentPlayer = "Player 2";
        }else{
          currentPlayer = "Player 1";
        }
      }
      
      return result;
    }
}
