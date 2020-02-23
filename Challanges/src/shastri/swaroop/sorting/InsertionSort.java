package shastri.swaroop.sorting;

public class InsertionSort {
	public static void main(String args[]) {
		int numArr[] = {3,11,2,9,5,6,1};
		int tmp;
		int j;
		for(int i=1; i<numArr.length; i++) {
			tmp = numArr[i];
			j = i-1;
			
			while(j>=0 && tmp< numArr[j]) {
				numArr[j+1] = numArr[j];
				j--;
			}
			numArr[j+1] = tmp;
		}
		
		for(int k=0 ; k<numArr.length;k++) {
			System.out.println(numArr[k]);
		}
	}
}
