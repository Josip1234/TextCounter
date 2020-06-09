package text.counter;

import java.util.List;
import java.util.Scanner;

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
		File file=new File();
		System.out.println("Insert path file");
		Scanner scanner=new Scanner(System.in);
		file.setPath(scanner.nextLine());
		file.setPath(file.convertToPath(file.getPath()));
		Messages.printMessage("Chosen path where file can be found is at this location:"+file.getPath());
		String running=Runing.Running.toString();
		String app=Runing.application.toString();
		Messages.printMessage(running+" "+app+"...");
	}

}
