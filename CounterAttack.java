import java.util.Arrays;
public class CounterAttack {
     public int[] analyze(String str, String[] words) {
         final int len = words.length;
		 int[] matches = new int[len];
		 String[] individuals = str.split(" ");
		 Arrays.fill(matches,0);
		 for (int c = 0; c < words.length; c++) {
			 for (String comp : individuals) {
				 if (words[c].equals(comp)) {
					 matches[c]+=1;
				 }
			 }
		 }
         return matches;
     }
 }