// Runtime: 1 ms, faster than 93.34% of Java online submissions
// Memory Usage: 39.2 MB, less than 100.00% of Java online submissions

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length;i++){
            int temp = (int)Math.log10(nums[i]);
            if ((temp+1) % 2 == 0)
                count++;
        }
        return count;
    }
}