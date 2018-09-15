import java.util.Arrays;
import java.lang.Character;
public class Anonymous {
      public int howMany(String[] headlines, String[] messages) {
            char ref;
			int ind;
			boolean possible;
			int total = 0;
			int[] available = new int[26];
			Arrays.fill(available,0);
			int[] needed = new int[26];
			for (int c = 0; c < headlines.length; c++) {
				for (int k = 0; k < headlines[c].length(); k++) {
					ref = headlines[c].charAt(k);
					if (ref != ' '){
						ind = Character.getNumericValue(ref);
						ind -= 10;
						available[ind]+=1;
					}
				}
			}
			for (int c = 0; c < messages.length; c++) {
				Arrays.fill(needed,0);
				for (int k = 0; k < messages[c].length(); k++) {
					ref = messages[c].charAt(k);
					if (ref != ' '){
						ind = Character.getNumericValue(ref);
						ind -= 10;
						needed[ind]+=1;
					}
				}
				possible = true;
				for (int k = 0; k < 26; k++) {
					if (available[k]<needed[k]) {
						possible = false;
						break;
					}
				}
				if (possible) {
					total++;
				}
			}
            return total;
      }
   }