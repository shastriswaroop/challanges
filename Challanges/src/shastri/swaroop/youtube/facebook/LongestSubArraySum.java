package shastri.swaroop.youtube.facebook;


//	Facebook Coding Interview Question - findLongestSubarrayBySum
//https://www.youtube.com/watch?v=XFPHg5KjHoo&t=656s
public class LongestSubArraySum {
	
	public static void main(String []args) {
		int goal =15;
		int arr[] = {1,2,0,0,0,0,0,3,4,5,0,0,0,6,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,9,10};
//		int arr[] = {1,2,3,4,5,0,0,0,6,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,9,10};
		
		int pt1=0;
		int pt2=0;
		int mArr[] = {0,0};
		
		int tmpSum =0 ;
		int index = 0;
		while (index<arr.length) {
			tmpSum = tmpSum+arr[index];
			if(tmpSum==goal) {
				pt2 = index;
				if((pt2-pt1)>(mArr[1]-mArr[0])) {
					mArr[0] = pt1;
					mArr[1] = pt2;
				}
			} 
			if(tmpSum>goal) {
				// time to reset counters :)
				pt1++;
				index= pt1;
				tmpSum = 0;
			} else {
				index++;
			}
		}
//		System.out.println(pt2 + " , " + pt1);
		System.out.println(mArr[1] + " , " + mArr[0]);	
	}
}
