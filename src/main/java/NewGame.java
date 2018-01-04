/**
 * Created by Guest on 1/4/18.
 */
public class NewGame {
    private String direction = "";
    private int turn = 0;
    public NewGame (String input) {
        this.direction = input;
        this.turn = turn;
    }

    public String getDirection() {
        return this.direction;
    }

    public int getTurn() {
        return this.turn;
    }

    public void setTurn() {
        this.turn++;
    }

    public String returnMove(String input0) {
        getTurn();
        if (input0.equals("Let's go on adventures together!") && this.turn == 0) {
            setTurn();
            return null;
        } else if (input0.equals("Let's stay home. I'm tired.") && this.turn == 0) {
            setTurn();
            return null;
        } else if (this.turn == 0) {
            return null;
        } else {
            return "";
        }
    }
}
