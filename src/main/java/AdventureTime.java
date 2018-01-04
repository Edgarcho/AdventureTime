/**
 * Created by Guest on 1/4/18.
 */

public class AdventureTime {
    private String game = "";
    public AdventureTime(String input) {
        this.game = input;
    }
    public String getGame() {
        return this.game;
    }

    public boolean startGame(String newGame) {
        getGame();
        if (newGame.equals("Start")) {
            return true;
        } else {
            return false;
        }
    }


}
