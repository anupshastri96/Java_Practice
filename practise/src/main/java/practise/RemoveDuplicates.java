package practise;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
	int[] numArray = {2,2,4,4,5,6,3,3,6,7,5,5};
	int [] duplicateRemoved = removeDuplicate(numArray);
	System.out.println("Duplicate removed");
	for(int num : duplicateRemoved)
	{
		System.out.print(num);
	}
	}
	private static int[] removeDuplicate(int[] numArray2) {
		Set<Integer> numSet = new HashSet<>();
		for(int num : numArray2) {
			numSet.add(num);
		}
		int[] newArray = new int[numSet.size()];
		int index = 0;
		for(int n:numSet) {
			newArray[index++]=n;
		}
		return newArray;
	}
}
