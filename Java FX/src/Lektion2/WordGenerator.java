package Lektion2;

import java.util.Random;

public class WordGenerator {
    private Random rnd = new Random();

    public String aWord() {
        // Size of word, between 2 and 8 letters.
        int size = rnd.nextInt(8) + 2;

        // Stringbuilder to hold the word until it is finished.
        StringBuilder theWord = new StringBuilder();

        for(int i = 0; i < size; i++) {
            theWord.append((char)(rnd.nextInt(26) + 'a'));
        }

        return theWord.toString();
    }
}
