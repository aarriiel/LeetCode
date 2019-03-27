//0 ms, faster than 100.00%
//39.7 MB, less than 5.03%
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target)
                return i;
        }
        return nums.length;
    }
}