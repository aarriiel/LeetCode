//Runtime: 0 ms, faster than 100.00% of Java online submissions for Decompress Run-Length Encoded List.
//Memory Usage: 41.2 MB, less than 100.00% of Java online submissions f

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i=0;i<nums.length;i=i+2){
            len += nums[i];
        } 
        int[] ans = new int[len];
        int index = 0;
        for(int i=0;i<nums.length;i=i+2){
            Arrays.fill(ans, index, index+nums[i], nums[i+1]);
            index+=nums[i];
        }
        return ans;
    }
}