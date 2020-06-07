package text.counter;

import java.util.List;

/**
 * 
 * @author Korisnik
 * @category Concept
 * @since 7.6.2020. 13:16
 * @version 1.0
 *
 */
public interface Words {
	/***
	 * @author Korisnik
	 * @since 7.6.2020. 13:39
	 * @param word - what value you want to add to the lists of words
	 * @return list of words
	 */
    List<Word> addWord(String word);
}
