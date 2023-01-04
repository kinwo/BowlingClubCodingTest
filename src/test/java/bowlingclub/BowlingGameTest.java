package bowlingclub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for BowlingGame
 *
 * Created by henry on 24/05/2014.
 */
public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void setup() {
        this.game = BowlingGameBuilder.instance().buildBasicGame(10, 10, 2);
    }

    @After
    public void teardown() {
        this.game = null;
    }

    @Test
    public void testNormalScore() {
        game.roll(4);
        game.roll(4);
        assertEquals(8, game.score());
    }

    @Test
    public void testSpareScore() {
        game.roll(4);
        game.roll(6);
        game.roll(5);
        assertEquals(20, game.score());
    }

    @Test
    public void testStrikeScore() {
        game.roll(10);
        game.roll(5);
        game.roll(4);
        assertEquals(28, game.score());
    }

    @Test
    public void test2FramesScore() {
        game.roll(10);
        game.roll(5);
        game.roll(5);

        game.roll(10);
        game.roll(5);
        game.roll(5);

        assertEquals(60, game.score());
    }

    @Test
    public void testAllStrikeScore() {
        for (int i = 0; i < 10; i++) {
            game.roll(10);
            game.roll(10);
        }
        assertEquals(300, game.score());
    }

    @Test
    public void testExceedMaxFramesScore() {
        for (int i = 0; i < 15; i++) {
            game.roll(10);
            game.roll(10);
        }
        assertEquals(300, game.score());
    }

    @Test
    public void testZeroPinScore() {
        game.roll(0);
        game.roll(0);
        assertEquals(0, game.score());
    }

    @Test
    public void testStrikeThenSparePinScore() {
        game.roll(10);
        game.roll(2);
        game.roll(3);

        game.roll(1);
        game.roll(9);
        game.roll(1);

        assertEquals(32, game.score());
    }

    @Test
    public void testSpareThenStrikePinScore() {
        game.roll(1);
        game.roll(9);
        game.roll(1);

        game.roll(10);
        game.roll(2);
        game.roll(3);

        assertEquals(32, game.score());
    }
}
