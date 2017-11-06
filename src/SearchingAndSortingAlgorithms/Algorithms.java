package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}

		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int r = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				r++;
			}
		}
		return r;
	}

	public static double findTallest(List<Double> peeps) {
		Double t = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > t) {
				t = peeps.get(i);
			}
		}
		return t;
	}
	// Add other methods here

	public static Object findLongestWord(List<String> words) {
		int e = 0;
		int c = 0;
		String s = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > e) {
				e = words.get(i).length();
				c = i;
			}
		}
		s = words.get(c);
		return s;
	}

	public static Object containsSOS(List<String> message1) {
		if (message1.contains(" ... --- ... ")) {
			return true;
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = i + 1; j < results.size(); j++) {
				if (results.get(i) > results.get(j)) {
					double t = results.get(i);
					results.set(i, results.get(j));
					results.set(j, t);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = i + 1; j < unsortedSequences.size(); j++) {
				if (unsortedSequences.get(i).length() > unsortedSequences.get(j).length()) {
					String t = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(j));
					unsortedSequences.set(j, t);
				}
			}
		}
		return unsortedSequences;
	}
}