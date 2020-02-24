package shastri.swaroop.searching;
//https://www.geeksforgeeks.org/binary-search/
public class BinarySearchNonRec {

	public static void main(String...args) {
		int []searchArr = {1,2,3,4,5,6,7,10,12,23,56};
		int searchNumber = 23;
		BinarySearchNonRec binNonRec = new BinarySearchNonRec();
		int result = binNonRec.binarySearch(searchArr,0,searchArr.length-1, searchNumber);
		System.out.println("result  " + result);
	}
	
	private int binarySearch(int arr[], int lIdx, int rIdx, int goal) {
		while(lIdx<=rIdx) {
			int mid = lIdx+ (rIdx-lIdx)/2;
			if(arr[mid]==goal) {
				return 1;
			}
			if(goal<arr[mid]) {
				rIdx = mid -1;
			} else {
				lIdx = mid+1;	
			}
		}
		return -1;
	}
}
