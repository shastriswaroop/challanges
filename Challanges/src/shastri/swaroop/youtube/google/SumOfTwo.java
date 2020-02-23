package shastri.swaroop.youtube.google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//https://www.youtube.com/watch?v=sfuZzBLPcx4&t=538s
//Google Coding Interview Question - Sum Of Two
public class SumOfTwo {
	public static void main(String []args) {
		int goal = -8;
		int a[] = {0,0,-5,32000};
		int b[] = {-10,40,-3,9};
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		boolean result = false;
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]+b[j]==goal){
					result = true;
					break;
				}				
			}
			if(result) {
				break;
			}
		}
		System.out.println(result);
		
		for(int i = 0; i<a.length; i++) {
			map.put(goal-a[i], a[i]);
			System.out.println();
		}
		
		for(Entry<Integer, Integer> ent: map.entrySet() ) {
			System.out.println(ent.getValue());
			
		}
		
		for(int i =0; i<b.length; i++) {
			if(map.get(b[i])!=null) {
				result = true;
				break;
			}
		}
		System.out.println(result);
	}
}
