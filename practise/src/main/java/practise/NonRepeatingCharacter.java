package practise;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "swwiss";
		char result = nonRepeatingCharater(s);
		if(result!='\0') {
			System.out.println("The non repeaitng character is:"+result);
		}else {
			System.out.println("No repeating characters found");
		}

	}

	private static char nonRepeatingCharater(String s) {
		if(s==null || s.length()==0) {
			return '\0';
		}
		Map<Character,Integer> charMap = new HashMap<>();
		for(char c: s.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
		}
		for(char c: s.toCharArray()) {
			if(charMap.get(c)==1) {
				return c;
			}
		}
		return '\0';
	}

}
