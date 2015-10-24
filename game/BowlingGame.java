package game;

public class BowlingGame {

    private int[] rolls = new int[21];
    private int rollCount = 0;

    public void roll(int pins) {
        this.rolls[this.rollCount++] = pins;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rollIndex)) {
                score += 10 + strikeBonus(rollIndex);
                rollIndex += 1;
            } else if (isSpare(rollIndex)) {
                score += 10 + spareBonus(rollIndex);
                rollIndex += 2;
            } else {
                score += normalScore(rollIndex);
                rollIndex += 2;
            }
        }
        return score;
    }

    private int strikeBonus(int rollIndex) {
        return this.rolls[rollIndex + 1] + this.rolls[rollIndex + 2];
    }

    private int spareBonus(int rollIndex) {
        return this.rolls[rollIndex + 2];
    }

    private int normalScore(int rollIndex) {
        return this.rolls[rollIndex] + this.rolls[rollIndex + 1];
    }

    private boolean isStrike(int rollIndex) {
        return this.rolls[rollIndex] == 10;
    }

    private boolean isSpare(int rollIndex) {
        return this.rolls[rollIndex] + this.rolls[rollIndex + 1] == 10;
    }
}
