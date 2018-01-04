import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/4/18.
 */
public class AdventureTimeTest {
    @Test
    public void startGame_startsNewGame_true() throws Exception {
        AdventureTime testAdventureTime = new AdventureTime("Start");
        assertEquals(true, testAdventureTime.startGame("Start"));
    }

    @Test
    public void startGame_exitGame_false() throws Exception {
        AdventureTime testAdventureTime = new AdventureTime("Exit");
        assertEquals(false, testAdventureTime.startGame("Exit"));
    }

    @Test
    public void getTurn_add1toTurn_1() throws Exception {
        NewGame testNewGame = new NewGame("string");
        testNewGame.returnMove("Let's go on adventures together!");
        assertEquals(1, testNewGame.getTurn());
    }

    @Test
    public void returnMove_returnsString_true() throws Exception {
        NewGame testNewGame = new NewGame("string");
        assertEquals("class java.util.String", testNewGame.returnMove("Let's go on adventures together!").getClass());
    }
}