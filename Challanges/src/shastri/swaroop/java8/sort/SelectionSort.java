package shastri.swaroop.java8.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[]) {
		int arr[] = {3,11,2,9,5,6,1,88,8,54};
		int min;
		int tmp;
		
		for(int i=0; i<arr.length;i++) {
			min = findMin(i,arr);
		
			if(arr[min]<arr[i]) {
				tmp = arr[min];
				arr[min] = arr[i];
				arr[i] =tmp;
			}
		}
		
		Arrays.stream(arr).forEach(e->System.out.println(e));
		
	}
	
	private static int findMin(int sIndex, int arr[]) {
		int mIndex = sIndex;
		int min = arr[sIndex];

		for(int idx=sIndex; idx<arr.length; idx++ ) {
			
			if(min>arr[idx]) {
				min = arr[idx];
				mIndex = idx;
				
			}
		}
		
		return mIndex;
	}
}
