/**
 * Created by Guest on 1/3/18.
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class Hangman {
    public static String randomWordChoice() {
        String[] wordList = {"a"};
        Random randomGen = new Random();
        Integer randomWord = randomGen.nextInt(wordList.length);
        String chosenWord = wordList[randomWord].toString();

        char[] charChosenWord = wordList[randomWord].toCharArray();
        String hidden = new String(new char[chosenWord.length()]).replace("\0", "_");
        return hidden;
        for (int i = 0; i <= charChosenWord.length; i++) {

            if (charChosenWord.get(i).equals(guessLetter));

        }





//        Character inputLetter = guessLetter;
//        for(int i = 0; i <=charChosenWord.length; i++){
//            charChosenWord[i].replace("\0", "_");
//        } if (charChosenWord == inputLetter) {
//            charChosenWord[i].replace("_", inputLetter);
//        } else {
//            return "Wrong, try again";
//        }
    }
}

