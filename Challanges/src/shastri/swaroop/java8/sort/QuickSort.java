package shastri.swaroop.java8.sort;

import java.util.Arrays;
//https://howtodoinjava.com/algorithm/quicksort-java-example/
public class QuickSort {
	public static void main(String args[]) {
		int arr[] = {3,11,2,9,5,6,1,88,8,54};
		quickSort(arr, 0, arr.length-1);
		Arrays.stream(arr).forEach(e->System.out.print(e + " "));
//		System.out.print(Arrays.toString(arr));
	}
	
	private static void quickSort(int arr[], int low, int high) {
	       //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }
         
        if (low >= high){
            return;
        }
		
        int middle = low + (high-low)/2;
		int pivot = arr[middle];
		int i= low;
		int j= high;	
		
		while(i<=j) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<=j) {	
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		
		if(j>low) {
			quickSort(arr,low, j);
		}
		if(i<high) {
			quickSort(arr,i,high);
		}
	}
	
	private static void swap(int arr[], int low, int high) {
		int tmp = arr[low];
		arr[low] = arr[high];
		arr[high] = tmp;
	}

}
