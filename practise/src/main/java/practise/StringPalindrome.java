package practise;

public class StringPalindrome {

	public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean isPalindrome = isPalindrome(s);
        System.out.println("Is the string a palindrome? " + isPalindrome);

	}
	public static boolean isPalindrome(String s) {
		if(s==null) {
			return false;
		}
		int left = 0;
		int right = s.length()-1;
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
