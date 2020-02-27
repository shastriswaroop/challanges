package shastri.swaroop.java8.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {19,2,3,5,4,32,1,0};
		int key;
		int j;
		for(int i=1; i<arr.length; i++) {
			key = arr[i];
			j = i - 1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		Arrays.stream(arr).forEach(e->System.out.println(e));
	}

}
