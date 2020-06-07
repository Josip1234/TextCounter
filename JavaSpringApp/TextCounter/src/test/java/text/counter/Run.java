package text.counter;

import java.util.List;

import lombok.Data;

/***
 * 
 * @author Korisnik
 * @category Concept
 * @since 7.6.2020. 13:22
 * @version 1.0
 *
 */
@Data
public class Run implements Words {
	
	

	@Override
	public List<Word> addWord(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	
	static void run() {
		String running=Runing.Running.toString();
		String app=Runing.application.toString();
		Messages.printMessage(running+app+"...");
	}

}
