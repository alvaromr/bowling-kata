package test;

import game.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    private BowlingGame g;

    @Before
    public void setUp() {
        g = new BowlingGame();
    }

    private void rollMany(int n, int pins) {
        for(int i = 0; i< n; i++){
            g.roll(pins);
        }
    }

    private void rollTwice(int first, int second) {
        g.roll(first);
        g.roll(second);
    }

    private void rollSpare() {
        rollTwice(5, 5);
    }

    @Test
    public void testGutterGame(){
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes(){
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare(){
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.score());
    }

    @Test
    public void testNotASpare(){
        rollTwice(3,5);
        rollTwice(5,1);
        rollMany(16, 0);
        assertEquals(14, g.score());
    }
}

