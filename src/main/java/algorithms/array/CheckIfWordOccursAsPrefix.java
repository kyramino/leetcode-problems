package algorithms.array;

/**
 * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */
public class CheckIfWordOccursAsPrefix {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

}
