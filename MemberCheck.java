import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class MemberCheck {
      public String[] whosDishonest(String[] club1, 
                                    String[] club2, 
                                    String[] club3) {
             boolean trash;
			 HashSet<String> one = new HashSet<>(Arrays.asList(club1));
			 HashSet<String> two = new HashSet<>(Arrays.asList(club2));
			 HashSet<String> three = new HashSet<>(Arrays.asList(club3));
			 HashSet<String> onetwo = new HashSet<>(one);
			 HashSet<String> onethree = new HashSet<>(one);
			 HashSet<String> twothree = new HashSet<>(two);
			 trash = onetwo.retainAll(two);
			 trash = onethree.retainAll(three);
			 trash = twothree.retainAll(three);
			 HashSet<String> unified = new HashSet<>(onetwo);
			 trash = unified.addAll(onethree);
			 trash = unified.addAll(twothree);
			 ArrayList<String> sorting = new ArrayList<String>(unified);
			 Collections.sort(sorting);
			 String[] names = sorting.toArray(new String[0]);
			 return names;
      }
   }