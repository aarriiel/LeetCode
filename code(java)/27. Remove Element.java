//runtime beats 100.00 % of java submissions.
//memory usage beats 5.05 % of java submissions.

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)
            return 0;
        
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            if(nums[left]==val){
                nums[left] = nums[right];
                nums[right] = val;
                right--;
            }
            else
                left++;     
        }
        return left;
    }
}