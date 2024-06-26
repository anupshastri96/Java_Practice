package practise;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacci(10);
		
		for(int i=0;i<10;i++) {
			System.out.print(fibonacciRecurssive(i)+", ");
		}

	}
	public static void fibonacci(int number) {
		
		int first=0;
		int second=1;

		for(int i=1;i<=number;i++) {
			System.out.print(first+" ");
			int sumofPrevious = first + second;
			first = second;
			second = sumofPrevious;
		}
				
	}
	public static int fibonacciRecurssive(int number) {
		
		if(number<=1) {
			return number;
		}
		return fibonacciRecurssive(number-1)+fibonacciRecurssive(number-2);
				
	}

}
