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
}

