import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 1/4/18.
 */
public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Choose your own adventure: Type \"Start\" to start a new game or \"Exit\" exit?");
            String input = bufferedReader.readLine();
            AdventureTime newAdventureTime = new AdventureTime(input);
            if (newAdventureTime.startGame(input)) {
                System.out.println("Welcome to the Land of Ooo\n You are Finn the Human, perhaps the last human in Ooo. Your best friend, Jake the Dog, asks, \"Hey Finn, what do you want to do today?\".\n Enter either: \"Let's go on adventures together!\" or \"Let's stay home. I'm tired.\"");
                String input0 = bufferedReader.readLine();

            } else {
                System.out.println("Thank you for playing!");
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
