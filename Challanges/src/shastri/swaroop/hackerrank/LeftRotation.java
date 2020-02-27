package shastri.swaroop.hackerrank;

public class LeftRotation {
	public static void main(String arg[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//		int arr[] = {5,6,7,8,9,10,1,2,3,4};

		int rotation = 4;
		
		arr = solution(arr, rotation);
		
		for(int i: arr) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int [] a, int d) {
		int arrSize = a.length;
		int tmpArr[] = new int[d]; 
		if(d > arrSize) {
			d = d % arrSize;
		}
		
		for(int i=0; i< d ; i++) {
			tmpArr[i] = a[i];
		}
		
		for(int j=0; j<a.length - d; j++) {
			a[j] = a[j+ d];			
		}
		
		for(int k =0; k< d; k++) {
			a[a.length - d + k] = tmpArr[k];
		}
		
		return a;
		
	}
}

