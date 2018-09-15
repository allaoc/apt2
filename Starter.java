import java.util.Arrays;
import java.util.HashSet;
public class Starter {
     public int begins(String[] words, String first) {
         char comp = first.charAt(0);
		 int matches = 0;
		 HashSet<String> filtered = new HashSet<>(Arrays.asList(words));
		 for (String word : filtered) {
			 if (word.charAt(0) == comp) {
				 matches++;
			 }
		 }
         return matches;
     }
 }