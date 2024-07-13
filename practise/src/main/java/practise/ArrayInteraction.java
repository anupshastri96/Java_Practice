package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayInteraction {

	public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};
		
		List<Integer> intersection = new ArrayList<>();
		intersection=findArrayIntersection(array1,array2);
		System.out.print("Array: "+intersection);
		
		}

	private static List<Integer> findArrayIntersection(int[] array1, int[] array2) {
		Map<Integer,Integer> hashMapIntersection = new HashMap<>();
		List<Integer> intersectionList = new ArrayList<>();
		
		for(int i =0;i<array1.length;i++) {
			hashMapIntersection.put(array1[i], hashMapIntersection.getOrDefault(array1[i],0)+1);
			
		}
		
		for(int i=0;i<array2.length;i++) {
			if(hashMapIntersection.keySet().contains(array2[i])){
				intersectionList.add(array2[i]);
				hashMapIntersection.put(array2[i],hashMapIntersection.get(array2[i])-1);				
			}
		}
		
		return intersectionList;
	}

}
