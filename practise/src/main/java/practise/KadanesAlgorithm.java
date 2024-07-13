package practise;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		int[] array= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int maxSoFar=maxsumofsubarray(array);
		System.out.println("Max Sum SO Far:"+maxSoFar);
	}

	private static int maxsumofsubarray(int[] array) {
		int maxsofar=array[0];
		int maxEndinghere=array[0];
		
		for(int i=1;i<array.length;i++) {
			maxEndinghere=Math.max(array[i], array[i]+maxEndinghere);
			maxsofar = Math.max(maxEndinghere, maxsofar);
		}
		return maxsofar;
	}

}
