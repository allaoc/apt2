import java.util.Arrays;
import java.util.HashSet;
public class SimpleWordGame {
      public int points(String[] player, 
                        String[] dictionary) {
          int score = 0;
		  HashSet<String> guess = new HashSet<>(Arrays.asList(player));
		  HashSet<String> dict = new HashSet<>(Arrays.asList(dictionary));
		  HashSet<String> comp = new HashSet<>(guess);
		  boolean trash = comp.retainAll(dict);
		  for (String s : comp) {
			  score += s.length()*s.length();
		  }
		  return score;
      }
  }