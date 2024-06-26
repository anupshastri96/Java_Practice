package practise;

public class BubbleSort {

	public static void main(String[] args) {
		int[] n = {5,2,9,1,5,6};
		System.out.print("Sorted array is: ");
		for(int number:bubbleSort(n)) {
			System.out.print(number+" ");
		}
	}
	
	public static int[] bubbleSort(int[] numbers) {
		int n = numbers.length;
		boolean swapped;
		for(int i=0;i<n;i++) {
			swapped = false;
			for (int j=0; j<n-1-i;j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					swapped=true;
				}
			}
			if(!swapped==true) break;
		}
		
		
		return numbers;
		
	}

}
