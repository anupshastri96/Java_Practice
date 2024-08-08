package practise;

import java.util.HashSet;
import java.util.Set;

public class FindPairOfSum {

	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 3, 6};
		int target = 6;
		findPairs(number,target);

	}

	private static void findPairs(int[] numbers, int target) {
		Set<Integer> seen = new HashSet<>();
		Set<String> output = new HashSet<>();
		
		for(int number:numbers) {
			int compliment = target - number;
			if(seen.contains(compliment)) {
				int first = Math.min(compliment, number);
				int second = Math.max(compliment, number);
				output.add(first+","+second);
			}
			seen.add(number);
		}
		for(String s : output) {
			System.out.print("Pairs:("+s+")");
		}
		
	}

}
