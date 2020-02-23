package shastri.swaroop.sorting;

import java.util.Arrays;

public class QSorrt {
	public static void main(String...args) {
		int arr[] = {1,19,29,30,2,20,4,3,9,8,7,6,5};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int arr[], int low, int high) {
		if(arr == null ||arr.length==0) {
			return;
		}
		
		if(low>=high) {
			return;
		}
		
		int i= low;
		int j= high;
		
		int middle = i+(j-i)/2;
		int pivot = arr[middle];
		
		while(i<=j) {
			while(arr[i]<pivot) {
				i++;
			}
			while (arr[j]>pivot) {
				j--;
			}
			
			if(i<=j) {
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		
		if(low<j) {
			quickSort(arr, low, j);
		}
		if(high>i) {
			quickSort(arr,i,high);
		}
	}
	
	static void swap(int arr[], int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}
