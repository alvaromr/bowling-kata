package game;

public class BowlingGame {

    private int score = 0;

    public void roll(int pins) {
        this.score += pins;
    }

    public int score() {
        return this.score;
    }
}
