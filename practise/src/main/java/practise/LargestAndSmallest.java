package practise;

import java.util.ArrayList;
import java.util.List;

public class LargestAndSmallest {
	
	public static void main(String[] args) {
		int[] numbers = {2,10,7,9};
		calculate(numbers);
	}
	
	public static void calculate(int[] numbers){
		int smallest = numbers[0];
		int largest = numbers[0];
		for(int i =0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("largest: "+largest+" smallest: "+smallest);
		
	}

}
