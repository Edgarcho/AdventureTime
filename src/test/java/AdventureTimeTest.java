import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/4/18.
 */
public class AdventureTimeTest {
    @Test
    public void startAdventureTime_startsNewGame_NewGame() throws Exception {
        AdventureTime testAdventureTime = new AdventureTime("Start");
        assertEquals(true, testAdventureTime.startGame("Start"));
    }

}