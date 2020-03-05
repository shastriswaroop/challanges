package shastri.swaroop.leetcode.easy;

public class RemoveElement {
    public static void main(String[] args){

    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==val){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]!=2){
                        nums[i] = nums[j];
                        nums[j] = val;
                        count++;
                        break;
                    }
                }
            } else {
                count++;
            }
        }
        return count;
    }
}
