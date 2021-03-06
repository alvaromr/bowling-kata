# Bowling Kata
Simple Test Driven Development Kata

## Problem Description

An American Ten-Pin Bowling Game consists of 10 frames:
+ In each frame the player has two opportunities to knock down 10 pins. 
+ The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.
  + A spare is when the player knocks down all 10 pins in two tries. 
    + The bonus for that frame is the number of pins knocked down by the next roll. 
  + A strike is when the player knocks down all 10 pins on his first try. 
    + The bonus for that frame is the value of the next two balls rolled.
+ In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame. However no more than three balls can be rolled in
tenth frame.
  
## Requirements
+ Write a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game.
+ Solve the problem using TDD. 
+ Write a class named `BowlingGameTest`
+ Write a class named `BowlingGame` that has two methods:
  + `roll(pins : int)` is called each time the player rolls a ball. The argument is the number of pins knocked down.
  + `score() : int` is called only at the very end of the game. It returns the total score for that game.
