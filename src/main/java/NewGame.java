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

    public String returnMove(String input0) {
        getTurn();
        if (input0.equals("Let's go on adventures together!") && this.turn == 0) {
            this.turn++; //turn = 1
            return "Jake says, \"Ok, that sounds fun! Let's beat up zombies!\" You go to the graveyard, but there are no zombies. You see a familiar crypt that is normally dark, but there's a light inside. Enter either: \"Enter the crypt\" or \"Wait for zombies\"";
        } else if (input0.equals("Let's stay home. I'm tired.") && this.turn == 0) {
            this.turn += 2; //turn = 2
            return "You take a nap, but after twenty minutes, Princess Bubblegum comes into your room. \"Finn, we need your help. The Fire Monster is destroying Candy Village!\"";
        } else if (this.turn == 0) {
            return "Please enter another input";
        } else if (this.turn == 1 && input0.equals("Enter the crypt")) {
            this.turn += 2; // turn 3
        } else if (this.turn == 1 && input0.equals("Wait for zombies")) {
            this.turn += 3; // turn 4
//        } else if (this.turn == 1) {
//            return "Please enter another input";
//        } else if (this.turn == 2 && input0.equals()) {
//
//        } else if () {
//
//        } else if () {

        } else {
            return "I'm sorry, we don't understand your input";
        }
        return null;
    }
}
