package test;

import game.BowlingGame;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    @Test
    public void test(){
        BowlingGame g = new BowlingGame();
        for(int i = 0; i< 20; i++){
            g.roll(0);
        }
        assertEquals(0, g.score());
    }
}

