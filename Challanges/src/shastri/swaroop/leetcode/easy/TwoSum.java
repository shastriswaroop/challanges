package shastri.swaroop.leetcode.easy;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
	public static void main(String...arg) {
		int nums[] = {3,2,1,4,5};
		int target = 6;
		TwoSum ts = new TwoSum();
		ts.twoSum(nums, target);
	}
	
    public int[] twoSum(int[] nums, int target) {
    	
        int pt1 = 0;
        int pt2 = 1;
        while(pt1<nums.length) {
        	if(pt2>nums.length-1) {
        		pt1++;
        		pt2 = pt1+1;
        	}       	
        	if((nums[pt1]+nums[pt2])==target) {
        		break;
        	} 
        	pt2++;

        }
        System.out.println(pt1 + " , " + pt2);
        return new int[] {pt1,pt2};
    }

}
