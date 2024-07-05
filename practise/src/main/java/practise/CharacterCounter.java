package practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterCounter {

	public static void main(String[] args) {
		String word= "accessories";
		HashMap<Character,Integer> wordCount = wordCounter(word);
		for(Entry<Character, Integer> entrySet :wordCount.entrySet()) {
			System.out.println(entrySet.getKey()+" : "+entrySet.getValue());
		}

	}

	private static HashMap<Character, Integer> wordCounter(String word) {
		HashMap<Character, Integer> wordHashMap =  new HashMap();
		for(Character s : word.toCharArray()) {
			wordHashMap.put(s,wordHashMap.getOrDefault(s,0)+1);
		}

		return wordHashMap;
	}

}
