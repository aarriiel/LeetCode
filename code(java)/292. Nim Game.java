//Runtime: 0 ms, faster than 100.00% of Java online submissions for Nim Game.
//Memory Usage: 31.7 MB, less than 98.89% of Java online submissions for Nim Game.
class Solution {
    public boolean canWinNim(int n) {
        return !(n%4==0);
    }
}