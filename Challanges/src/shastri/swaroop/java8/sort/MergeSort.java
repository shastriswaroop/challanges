package shastri.swaroop.java8.sort;

import java.util.Arrays;
//https://www.geeksforgeeks.org/merge-sort/
public class MergeSort {
	
	public static void main(String...args) {
		int arr[] = {1,19,29,30,2,20,4,3,9,8,7,6,5};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	private static void sort(int arr[], int l, int r) {
		if(l<r) {
			int m =(l+r)/2;
			
			sort(arr, l,m);
			sort(arr,m+1,r);
			
			merge(arr, l, m, r);
		}
	}
	
	private static void merge(int arr[], int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i]= arr[i+l];
		}
		for(int j=0;j<n2;j++) {
			R[j]= arr[j+m+1];
		}
		
		int i=0,j=0;
		int k=l;
		
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = L[i];
			k++;
			i++;
		}
		
		while(j<n2 ) {
			arr[k] = R[j];
			k++;
			j++;
		}
		
	}
}
