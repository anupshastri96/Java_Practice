package practise;

public class Palindrome {
	
	public static void main(String[] args) {
		int number = 121;
		boolean isPalindrome = isNumberPalindrome(number);
		System.out.println("Is the number "+number+" a palindrome:"+isPalindrome);
		
	}

	private static boolean isNumberPalindrome(int number) {
		int target = number;
		int reverse=0;
		
		while(number!=0) {
			int digit=number % 10;
			reverse= reverse*10+digit;
			number /= 10;
		}
		return target == reverse;
	}
}
