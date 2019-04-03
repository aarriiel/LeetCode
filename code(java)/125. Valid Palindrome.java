//Runtime: 5 ms, faster than 63.05% of Java online submissions for Valid Palindrome.
//Memory Usage: 39 MB, less than 25.56% of Java online submissions for Valid Palindrome.
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0,right=s.length()-1;
        while(left<right){
            while(s.charAt(left)<48||s.charAt(left)>57&&s.charAt(left)<97||s.charAt(left)>122){
                left++;
                if(left>s.length()-1)
                    return true;
            }
            while(s.charAt(right)<48||s.charAt(right)>57&&s.charAt(right)<97||s.charAt(right)>122){
                right--;
                if(right<0)
                    return true;   
            }
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}