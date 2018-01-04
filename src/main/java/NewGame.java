/**
 * Created by Guest on 1/4/18.
 */
public class NewGame {
    private String direction = "";
    private int turn = 0;
    public NewGame (String input) {
        this.turn = 0;
        this.direction = input;
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
            return "You take a nap, but after twenty minutes, Princess Bubblegum comes into your room. \"Finn, we need your help. The Fire Monster is destroying Candy Village!\" Enter either: \"Fight fire monster\" or \"Keep sleeping\"";
        } else if (this.turn == 1 && input0.equals("Enter the crypt")) {
            this.turn += 2; // turn 3
            return "As you enter the crypt, a dark force enter the room. Omg it's a FIRE MONSTER! Enter either: \"Debate FIRE MONSTER\" or \"Fight FIRE MONSTER\"";
        } else if (this.turn == 1 && input0.equals("Wait for zombies")) {
            this.turn += 3; // turn 4
            return "After a few hours, you see zombies. The zombies start to dance. Enter either: \"Dance with the zombies\" or \"Annihilate the zombies\"";
        } else if (this.turn == 2 && input0.equals("Fight fire monster")) {
            this.turn += 3; //turn 5
            return "You enter the Candy Kingdom and see the Fire Monster wrecking havoc. Enter either: \"Take a swing from your sword\" or \"Use Jake\"";
        } else if (this.turn == 2 && input0.equals("Keep sleeping")) {
            this.turn = -1;
            return "The Fire Monster destroys all of the Candy Kingdom. Your house is burned down while you're sleeping. Game over.";
        } else if (this.turn == 3 && input0.equals("Debate FIRE MONSTER")) {
            this.turn += 3; //turn 6
            return "You ask the Fire Monster why he likes destroying things. He says it's a coping mechanism to deal with his recent breakup with the Fire Princess. Enter either: \"Maybe I can help you get back together\" or \"Forget her. Let's get a drink!\"";
        } else if (this.turn == 3 && input0.equals("Fight FIRE MONSTER")) {
            this.turn = -1;
            return "You take out your sword. The FIRE MONSTER instantly kills you. Game over.";
        } else if (this.turn == 4 && input0.equals("Dance with the zombies")) {
            this.turn = -1;
            return "You join the zombies. They start to like you and you begin discussing creating a dance troupe. A Fire Monster comes out of the crypt intending to destroy all of you, but he starts dancing too! You all start a big dance troupe and become the Riverdance of the Land of Ooo. You won!";
        } else if (this.turn == 4 && input0.equals("Annihilate the zombies")) {
            this.turn += 3; // turn 7
            return "You annihilate the zombies. In a fit of rage, you slingshot off Jake and destroy the crypt near the zombies in one fell swoop. A dead Fire Monster appears underneath. Immediately after, the Fire Princess appears. She asks you, \"Why did you kill my ex-boyfriend? We were just about to get back together!\" Enter either: \"So what?\" or \"I'm sorry, Fire Princess. I didn't mean to kill your boyfriend. I was fighting zombies and I got carried away!\"";
        } else if (this.turn == 5 && input0.equals("Take a swing from your sword")) {
            this.turn = -1;
            return "You swing with your sword and miss. The Fire Monster annihilates you. Game over.";
        } else if (this.turn == 5 && input0.equals("Use Jake")) {
            this.turn += 2; //turn 7
            return "You slingshot off Jake and destroy the Fire Monster in one quick swing of your sword to its head. Immediately after, the Fire Princess appears. She asks you, \"Why did you kill my ex-boyfriend? We were just about to get back together!\" Enter either: \"So what?\" or \"I'm sorry, Fire Princess. I didn't mean to kill your boyfriend. I was fighting zombies and I got carried away!\"";
        } else if (this.turn == 6 && input0.equals("Forget her. Let's get a drink!")) {
            this.turn = -1;
            return "The FIRE MONSTER cackles. \"I see, you want to steal my girlfriend!\" He instantly annihilates you. Game over.";
        } else if (this.turn == 6 && input0.equals("Maybe I can help you get back together")){
            this.turn += 2; //turn 8
            return "The FIRE MONSTER sulks. He says, \"I'm not sure if you can. She's really angry at me this time. She doesn't like my toupee.\" Enter either: \"Maybe she'll accept you for who you are.\" or \"You don't need a toupee! You should just use a hat.\" ";
        } else if (this.turn == 7 && input0.equals("So what?")){
            this.turn = -1;
            return "The Fire Princess destroys the Candy Kingdom in a fit of rage. Game over";
        } else if (this.turn == 7 && input0.equals("I'm sorry, Fire Princess. I didn't mean to kill your boyfriend. I was fighting zombies and I got carried away!")) {
            this.turn += 2; //turn 9
            return "The Fire Princess says, \"Wow, you're strong and you're kinda cute, not to mention warm. Would you like to be my boyfriend?\" Enter either: \"Yes\" or \"No\"";
        } else if (this.turn == 8 && input0.equals("You don't need a toupee! You should just use a hat.")) {
            this.turn = -1;
            return "The Fire Monster screams, \"I HATE HATS\" and instantly annihilates you. Game over.";
        } else if (this.turn == 8 && input0.equals("Maybe she'll accept you for who you are.")) {
            this.turn = -1;
            return "The Fire Monster asks you, \"What if she doesn't?\" You respond, \"There's only one way to find out!\" You, Jake and the Fire Monster travel to the Fire Princess's palace. She flies to the Fire Monster and gives him a big hug. \"I missed you so much!\" she says. The Fire Monster asks, \"What about my toupee?\" \"I don't care about what you wear on your head. I just care about what's on the inside.\" You saved the Land of Ooo and the Fire Monster's relationship! You won!";
        } else if (this.turn == 9 && input0.equals("No")) {
            this.turn = -1;
            return "The Fire Princess takes you hostage and keeps you as a love slave. Game over";
        } else if (this.turn == 9 && input0.equals("Yes")) {
            this.turn = -1;
            return "The Fire Princess becomes excited. You begin dating, and after a few years, you get married. You become the Fire King eventually. You won!";
        } else {
            return "I'm sorry, we don't understand your input";
        }
    }
}
