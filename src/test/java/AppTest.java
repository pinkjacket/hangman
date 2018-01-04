import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Guest on 1/3/18.
 */
public class AppTest {

    @Test
    public void newHangman_instantiatesCorrectly() {
        Hangman testHangman = new Hangman("a");
        assertEquals(true, testHangman instanceof Hangman);
    }
    @Test
    public void newHangman_wordsToPick() {
        Hangman testHangman = new Hangman("apple");
        assertEquals(true, testHangman instanceof Hangman);
    }
}