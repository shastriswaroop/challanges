package shastri.swaroop.java8.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {19,2,3,5,4,32,1,0};
		int tmp;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				tmp = arr[j];
				if(tmp>arr[j+1]) {
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					tmp = arr[j];
				}
			}
		}
		
		Arrays.stream(arr).forEach(e->System.out.println(e));
	}

}
