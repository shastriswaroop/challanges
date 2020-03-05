package shastri.swaroop.leetcode.medium;
/*
238. Product of Array Except Self
Given an array nums of n integers where n > 1,  return an array output such that output[i] 
is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).
*/
public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int N = nums.length;
		int larr[] = new int[N];
		int rarr[] = new int[N];
		int out[] = new int[N];

		larr[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			larr[i] = larr[i - 1] * nums[i - 1];
		}

		rarr[N - 1] = 1;
		for (int i = N - 2; i >= 0; i--) {
			rarr[i] = rarr[i+1] * nums[i + 1];
		}
		
		for (int i = 0; i < N; i++) {
			out[i] = larr[i] * rarr[i];
		}

		return out;
	}

	public static void main(String... arg) {
		ProductofArrayExceptSelf prodOfArray = new ProductofArrayExceptSelf();
		int[] nums = { 9, 0, -2 };
		for (int i : nums) {
			System.out.println(i);
		}

		for (int i : prodOfArray.productExceptSelf(nums)) {
			System.out.println(i);
		}

	}
}
