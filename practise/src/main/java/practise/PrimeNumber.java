package practise;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(6));

	}
	
	public static boolean isPrime(int number) {
		
		if(number<=1) {
			return false;
		}else {
			for(int i=2;i<=Math.sqrt(number);i++) {
				if(number%2==0) {
					return false;
				}
			}
		}
		return true;
		
		
	}

}
