package text.counter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author Korisnik
 * @category Concept
 * @since 9.6.2020.
 * @version 1.0
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class File {
private String path;
private String fileName;

/***
 * @author Korisnik
 * @since 9.6.2020 16:51
 * @param path - open path
 * @return converted \ path to / path 
 */
public String convertToPath(String path) {
	char[] convertStringToCharArray=path.toCharArray();
	int max=convertStringToCharArray.length;
	char charToReplace='\\';
	char replaceCharWith='/';
	char[] convertedPath=new char[max];
	for (int i = 0; i < convertStringToCharArray.length; i++) {
		if(convertStringToCharArray[i]==charToReplace) {
			convertedPath[i]=replaceCharWith;
		}else {
			convertedPath[i]=convertStringToCharArray[i];
		}
		
	}
	String converted="";
	converted=convertCharArrayToString(convertedPath);
	return converted;
			
}
/***
 * @author Korisnik
 * @since 9.6.2020. 16:57
 * @param charArray - char array to convert
 * @return string 
 */
public String convertCharArrayToString(char[] charArray) {
	String converted="";
	for (char c : charArray) {
		converted+=c;
	}
	return converted;
}

}
