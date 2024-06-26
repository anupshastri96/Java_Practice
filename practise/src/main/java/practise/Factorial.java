package practise;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(0));
		System.out.println(factorialrecursion(0));
	}
	public static int factorial(int n) {
		int answer=1;
		if(n==0) {
			return 1;
		}
		for (int i=1;i<=n;i++) {
			answer *=i;
		}
		return answer;
		
	}
	
	public static int factorialrecursion(int n) {
	
		if(n==1||n==0) {
			return 1;
		}
		
		return n * factorialrecursion(n-1);
	}
}
