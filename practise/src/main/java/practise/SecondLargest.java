package practise;

public class SecondLargest {

	public static void main(String[] args) {
		int[] numbers = { 20,20, 8, 5, 10,11 };
		int secondLargest = secondLargestNumber(numbers);
		System.out.println("The second largest number is:"+ secondLargest);

	}

	private static int secondLargestNumber(int[] numbers) {
		if(numbers ==null || numbers.length<2) {
			throw new  IllegalArgumentException("An empty array or a array less than size of 2 can't have a 2nd Largest Number");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int number:numbers) {
			if(number>largest) {
				secondLargest = largest;
				largest = number;
			}else if(number>secondLargest && number!=largest) {
				secondLargest = number;
			}
		}
		return secondLargest;
	}
}

