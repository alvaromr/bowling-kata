package game;

public class BowlingGame {

    private int [] rolls = new int[21];
    private int rollCount = 0;

    public void roll(int pins) {
        this.rolls[this.rollCount++] = pins;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for(int frame = 0; frame < 10; frame++){
            if(isSpare(rollIndex)){
                score += 10 + this.rolls[rollIndex+2];
                rollIndex+=2;
            } else {
                score += this.rolls[rollIndex] + this.rolls[rollIndex + 1];
                rollIndex+=2;
            }
        }
        return score;
    }

    private boolean isSpare(int rollIndex) {
        return this.rolls[rollIndex] + this.rolls[rollIndex+1] == 10;
    }
}
