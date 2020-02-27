package shastri.swaroop.hackerrank;

//https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen
//https://www.youtube.com/watch?v=YWYF6bOhPW8

public class NewYearChaos {
	public static void main(String arg[]) {
		int arr[] = {2, 1, 5, 3, 4};
	//	int arr[] = {2, 5, 1, 3, 4};
		minimumBribes(arr);
	}
	
	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int minSwapCnt = 0;
    	for(int i=q.length-1; i>=0; i--) {
    		if(q[i] != i+1) {
    			
    			if(((i-1)>=0) && q[i-1]==(i+1)) {
    				minSwapCnt++;
    				swap(q, i, i-1);
    			} else if((i-2)>=0 && q[i-2]==(i+1)) {
    				minSwapCnt+=2;
    				swap(q, i-2, i-1);
    				swap(q, i-1, i);
    			} else {
    				System.out.println("Too chaotic");
    				return;
    			}    			
    		}
    	}
    	System.out.print(minSwapCnt);
    }
    
    // Complete the minimumBribes function below.
    static void swap(int[] q, int a, int b) {
    	int tmp = q[a];
    	q[a] = q[b];
    	q[b] = tmp;
    }
}
