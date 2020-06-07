package text.counter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author Korisnik
 * @category Concept
 * @since 7.6.2020. 13:11
 * @version 1.0
 * 
 */

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Word {
String value;
}
