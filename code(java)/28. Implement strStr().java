//Runtime: 0 ms, faster than 100.00% of Java online submissions
//Memory Usage: 38.3 MB, less than 63.36% of Java online submissions 

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;
        for(int i=0; i<=haystack.length()-needle.length();i++){;
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}