public class IsomorphicWords {
      public int countPairs(String[] words) {
		final int numwords = words.length;
		final int wordlen = words[0].length();
		int pairs = 0;
		boolean canpair;
		int[][] first = new int[numwords][wordlen];
		char comp;
		for (int c1 = 0; c1 < numwords; c1++) {
			for (int c = 0; c < wordlen; c++) {
				comp = words[c1].charAt(c);
				first[c1][c] = c;
				for (int k = 0; k < c; k++) {
					if (comp == words[c1].charAt(k)) {
						first[c1][c] = k;
						break;
					}
				}
			}
			for (int c = 0; c < c1; c++) {
				canpair = true;
				for (int k = 0; k < wordlen; k++) {
					if (first[c1][k] != first[c][k]) {
						canpair = false;
						break;
					}
				}
				if (canpair) {
					pairs++;
				}
			}
		}
		return pairs;
      }
   }