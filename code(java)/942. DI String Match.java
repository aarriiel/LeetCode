//Runtime: 2 ms, faster than 98.85% of Java online submissions for DI String Match.
//Memory Usage: 38.4 MB, less than 94.38% of Java online submissions for DI String Match.
//use two variables to store D and I.
class Solution {
    public int[] diStringMatch(String S) {
        int[] ans = new int[S.length()+1];
        int left=0;
        int right=S.length();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='D')
                ans[i]=right--;
            else
                ans[i]=left++;
        }
        ans[S.length()]=left;
        return ans;
    }
}