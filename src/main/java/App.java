import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Guest on 1/3/18.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String results = Hangman.randomWordChoice();
        System.out.println(results);

        try {
            System.out.println("Lets play Hangman?");
            System.out.println("Guess a letter:");
            String guessLetter = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
