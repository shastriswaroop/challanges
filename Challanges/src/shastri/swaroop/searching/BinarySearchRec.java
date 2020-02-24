package shastri.swaroop.searching;
//https://www.geeksforgeeks.org/binary-search/
public class BinarySearchRec {
	public static void main(String...args) {
		int []searchArr = {1,2,3,4,5,6,7,10,12,23,56};
		int searchNumber = 232;
		BinarySearchRec binRec = new BinarySearchRec();
		int result = binRec.binarySearch(searchArr,0,searchArr.length-1, searchNumber);
		System.out.println("result  " + result);
	}
	
	private int binarySearch(int arr[], int lIdx, int rIdx, int goal) {
		if(rIdx>=lIdx) {
			int mid = lIdx+ (rIdx-lIdx)/2;
			if(arr[mid]==goal) {
				return 1;
			}
			
			if(goal<arr[mid]) {
				return binarySearch(arr, lIdx, mid-1, goal);
			} else {
				return binarySearch(arr,mid+1,rIdx,goal);
			}
		}
		return -1;

	}
	
}
