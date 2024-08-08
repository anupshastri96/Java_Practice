package practise;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9};
		int target = 9;
		int index = binarySearchMethod(numbers,target);
		if(index!=-1) {
			System.out.print("Number found at location:"+index);
		}else {
			System.out.print("Number "+target+" not found");
		}
	}
	
	public static int binarySearchMethod(int [] listData, int target) {
		int left = 0;
		int right = listData.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(listData[mid] ==target ) {
				return mid;
			}else if(listData[mid]<target){
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
	}

}
