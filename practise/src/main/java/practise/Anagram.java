package practise;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "sileet";
		boolean result = isAnagram(str1,str2);
		System.out.println("given word are Anaragrm? "+result);

	}

	private static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		Map<Character,Integer> charMap = new HashMap();
		
		for(char c: str1.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c,0)+1);
		}
		for(char s: str2.toCharArray()) {
			if(!charMap.containsKey(s)) {
				return false;
			}
			charMap.put(s, charMap.get(s)-1);
			if(charMap.get(s)==0) {
				charMap.remove(s);
			}
			if(charMap.isEmpty()) {
				return true;
			}
		}
		return false;
	}

}
