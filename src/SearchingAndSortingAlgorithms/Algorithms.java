package SearchingAndSortingAlgorithms;

import java.util.Iterator;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (	eggs.get(i) == "cracked") {
				return i;
			}
		}
	
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int r = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (	oysters.get(i) == true) {
				r++;
			}
		}
		return r;
	}

	public static double findTallest(List<Double> peeps) {
		Double t = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
		if(peeps.get(i) > t) {
		t = peeps.get(i);
		}
		}
		return t;
	}
	//Add other methods here

	public static Object findLongestWord(List<String> words) {
		int e = 0;
		String s = "";
		for (int i = 0; i < words.size(); i++) {
		if(words.get(i).length() > e) {
		s = words.get(i);
		}
		}
		return s;
	}
}