package practise;

public class ReverseString {
	
	public static void main(String[] args) {
		String word = "hello";
		reverseByForLoop(word);
		reverseByStringBuilder(word);
		reverseByRecursion(word);
	}
	
	private static void reverseByForLoop(String word) {
		
		String reverse = "";
		for(int i=word.length()-1;i>=0;i--){
			//reverse = reverse+(word.charAt(i));
			reverse += word.charAt(i);
		}
		System.out.println(reverse);

	}
	
	private static void reverseByStringBuilder(String word) {
		StringBuilder sb = new StringBuilder(word);
		System.out.println(sb.reverse());

	}

	private static void reverseByRecursion(String word) {
		if(word.isEmpty()) {
			return;
		}
		reverseByRecursion(word.substring(1));
		System.out.print(word.charAt(0));
	}
}
